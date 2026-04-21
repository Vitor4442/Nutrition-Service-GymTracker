package GymTracker.nutritionv1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
@Component
public class LogAspect {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(LogAspect.class);


    @Before("execution(* GymTracker.nutritionv1.Service.*.*(..))")
    public void NameMethod(JoinPoint joinPoint){
        String nameMethod = joinPoint.getSignature().getName();
        logger.info("Metodo chamada: {}", nameMethod);
    }

    @Around("execution(* GymTracker.nutritionv1.Service.*.*(..))")
    public Object medirTempo(ProceedingJoinPoint joinPoint) throws Throwable {
        long inicio = System.currentTimeMillis();
        Object resultado = joinPoint.proceed();
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Método: " + joinPoint.getSignature().getName() +
                " | Tempo: " + tempo + " ms");
        return resultado;
    }
}
