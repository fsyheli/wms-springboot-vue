package heli.hrc.wmsspringboot.fitter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

/**
 * @PACKAGE_NAME: heli.hrc.wmsspringboot.fitter
 * @NAME: MyTestInterceptor
 * @USER: FSY
 * @DATE: 2023/10/9 0009
 * @TIME: 13:58
 * @YEAR: 2023
 * @MONTH_NAME_SHORT: 10月
 * @DAY_NAME_SHORT: 周一
 * @PROJECT_NAME: wms-springboot
 * @Description:
 */
public class MyTestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String remoteAddr = request.getRemoteAddr();
        String requestURI = Optional.ofNullable(request.getRequestURI()).orElse("/unKnown");
        if (requestURI.startsWith("/test"))
            return HandlerInterceptor.super.preHandle(request, response, handler);
        //todo:进行验证拦截
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
