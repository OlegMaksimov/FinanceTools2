package model;

public interface Product {
    /**
     * Рассчет коэфицента дисконтирования
     *
     * @return коэфицент дисконтирования
     */
    Double getDiscontProcentAllOfYear();

    /**
     * Рассчет будущей стоимости
     *
     * @return будущую стоимость
     */
    Double getFutureValue();

    /**
     * Рассчет приведенной стоимости
     *
     * @param futureValue стоимость актива в будущем через countYear
     * @return приведенную стоимость
     */
    Double getPV(Double futureValue);

    /**
     * Возвращает чистую приведенную стоимость
     *
     * @param futureValue стоимость актива в будущем через countYear
     * @return чистую приведенную стоимость
     */
    Double getNPV(Double futureValue);

    /**
     * Возвращает ожидаемую доходность
     *
     * @param futureValue будущая стоимость актива
     * @return ожидаемая доходность
     */
    Double getExcpectProcent(Double futureValue);

    /**
     * Возвращает ожидаемую доходность
     *
     * @param futureValue будущая стоимость актива
     * @return ожидаемая доходность
     */
    Double getExcpectProcent(Double[] futureValue);

    /**
     * Возвращает значение перпетуэтета
     *
     * @return значение перпетуэтета
     */
    Double getPerpetuity();

    /**
     * Возвращает значение аннуитета
     *
     * @return значение аннуитета
     */
    Double getAnnuity();

    /**
     * вычисление сложного процента
     *
     * @param m количество начислений в год
     * @return сложный процент
     */
    Double getCompoutInterest(int m);
}
