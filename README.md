
### گام ۱: افزودن یک روش پرداخت دیگر

1.	بدون آن‌که تابعی را از واسط Payment Service حذف کنید، یک کلاس دیگر تحت نام Phone Order Service ایجاد کنید و در آن، واسط Order Service را پیاده‌سازی کنید. 
2.	سپس یک تابع برای ثبت سفارش تلفنی (ورودی آن نام مشتری است) و یک تابع برای پرداخت سفارش تلفنی (ورودی آن مقدار کل مبلغ پرداختی سفارش است) به واسط Order Service اضافه کنید و آن را در کلاس Phone Order Service پیاده‌سازی کنید.
3.	در بدنه‌ی هر تابع، از یک دستور چاپ ساده بر روی صفحه نمایش استفاده کنید.
4.	در ادامه، سعی کنید که قابلیت سفارش تلفنی را نیز به برنامه اضافه کنید؛ یعنی کاری کنید که کاربر بتواند در قالب روش سوم سفارش خود را ثبت کرده و پرداخت را انجام دهد.
5.	تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلان کنید.
    - توجه: مواردی که به عنوان تغییرات باید اعلان شود شامل این موارد هستند:
      1. ساخت کلاس جدید
      2. افزودن تابع جدید به کلاس و یا واسط (برای توابع جدید صرفا اعلام تغییر کنید)
      3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال اگر سه خط را به منظور تشخیص نوع سفارش جدید اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزییات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phone Order Payment</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفتی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phone Order Payment</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>PhoneOrderServices</p>
</td>
<td width="141">
<p>اضافه کردن کلاس</p>
</td>
<td width="292">
<p>در این کلاس سفارش تلفنی پیاده سازی شده است و واسط orderServices پیاده سازی شده است</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>PhoneOrderServices</p>
</td>
<td width="141">
<p>پیاده‌سازی توابع موجود در واسط</p>
</td>
<td width="292">
<p>تمامی ۶ تابعی که در واسط هستند پیاده‌سازی می‌شوند. در این توابع بدنه دو تا تابع مربوط به پرداخت تلفنی پر است و بقیه توابع خالی است</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>OnlineOrderServices</p>
</td>
<td width="141">
<p>اضافه کردن توابع جدید واسط</p>
</td>
<td width="292">
<p>توابع جدید واسط به این کلاس اضافه شده و پیاده سازی می‌شوند(با بدنه خالی)</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>اضافه کردن توابع جدید واسط</p>
</td>
<td width="292">
<p>توابع جدید واسط به این کلاس اضافه شده و پیاده سازی می‌شوند(با بدنه خالی)</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۷</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>اضافه کردن امکان سفارش تلفنی</p>
</td>
<td width="292">
<p>در بخش دوم مین امکان گزیته سوم را فراهم میکنیم</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۸</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>اضافه کردن امکان خرید تلفنی</p>
</td>
<td width="292">
<p> در بخش سوم تابع مین امکان خرید تلفنی اضافه میشود که با کال کردن تابعی از کلاس مربوطه انجام میشود.</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: 8

### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>رابط OrderService مسئولیت های ثبت سفارش و پردازش پرداخت ها را ترکیب می کند. با این حال، کلاس های پیاده سازی فردی (OnlineOrderService، OnSiteOrderService، و PhoneOrderService) این مسئولیت ها را به درستی جدا می کنند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>ین کد تا حدی SRP را نقض می کند زیرا رابط OrderService دو مسئولیت را ترکیب می کند: ثبت سفارش ها و رسیدگی به پرداخت ها. در حالت ایده آل، این مسئولیت ها باید به رابط ها یا کلاس های مجزا تقسیم شوند. یک رابط می تواند ثبت سفارش را انجام دهد و رابط یا کلاس دیگری می تواند عملیات مربوط به پرداخت را انجام دهد.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>این کد درجه ای از پایبندی به OCP را نشان می دهد زیرا اجازه می دهد تا کلاس های خدمات سفارش جدید (مانند OnlineOrderService، OnSiteOrderService و PhoneOrderService) را بدون تغییر کد موجود اضافه کنید. این برنامه افزودنی را می توان مطابق با OCP در نظر گرفت.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>هیچ نقض آشکاری از OCP در این کد وجود ندارد.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس‌های OnlineOrderService و OnSiteOrderService و PhoneOrderService می‌توانند به‌جای اینترفیس پدر خود یعنی OrderService استفاده شوند و بنابراین این اصل رعایت شده است.

</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>هیچ نقض آشکاری از LSP در این کد وجود ندارد.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کد تا حدی با جداسازی متدها در کلاس‌های پیاده‌سازی (OnlineOrderService، OnSiteOrderService و PhoneOrderService) به ISP می‌پیوندد. هر کلاس پیاده سازی فقط متدهای مربوط به نوع سرویس سفارش خاص خود را پیاده سازی میکند. 
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>اینترفیس OrderService خود ISP را با استفاده از روش های متعددی که ممکن است برای همه کلاس های پیاده سازی مورد نیاز نباشد، نقض می کند.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کد مستقیماً به پیاده سازی های مشخص رابط OrderService در کلاس Main بستگی دارد. در حالی که این یک رویکرد رایج در برنامه‌های کاربردی ساده‌تر است، اما به طور کامل به DIP پایبند نیست، که ماژول‌های سطح بالا را تشویق می‌کند تا به انتزاعات و نه اجرای عینی وابسته شوند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کد DIP را با وابستگی مستقیم به پیاده سازی بتن OrderService در کلاس Main نقض می کند</p>
</td>
</tr>
</tbody>
</table>

در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>Single Responsibility Principle</p>
</td>
<td width="246">
<p>رابط OrderService مسئولیت های ثبت سفارش و پردازش پرداخت را ترکیب می کند.</p>
</td>
<td width="284">
<p>ایجاد رابط های جداگانه برای ثبت سفارش و پردازش پرداخت. به عنوان مثال، OrderRegistrationService و PaymentService. این رابط ها را در کلاس های مربوطه پیاده سازی کنید. <br> 2. رابط OrderService را به دو واسط مجزا تقسیم کنید که هر کدام بر روی یک مسئولیت تمرکز دارند.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Interface Segregation Principle	</p>
</td>
<td width="246">
<p>رابط OrderService شامل چندین متد است که ممکن است برای همه کلاس های پیاده سازی مورد نیاز نباشد.</p>
</td>
<td width="284">
<p>1. رابط های کوچکتر و خاص تر برای ثبت سفارش و پردازش پرداخت، تنها با روش های مربوطه ایجاد کنید. هر کلاس سرویس سفارش رابط مناسب را پیاده سازی می کند. <br> 2. استفاده از روش‌های پیش‌فرض در رابط را برای متدهایی در نظر بگیرید که می‌توانند پیاده‌سازی خالی پیش‌فرض داشته باشند، و به کلاس‌ها اجازه می‌دهد روش‌هایی را که می‌خواهند پیاده‌سازی کنند، انتخاب کنند.</p>
</td>
</tr>
<tr>
<td width="168">
<p>Dependency Inversion Principle	</p>
</td>
<td width="246">
<p>کلاس Main مستقیماً به پیاده سازی بتن رابط OrderService بستگی دارد.</p>
</td>
<td width="284">
<p>یک ظرف وارونگی کنترل (IoC) یا چارچوب تزریق وابستگی را برای مدیریت وابستگی ها معرفی کنید. ظرف IoC می تواند پیاده سازی مناسب OrderService را در زمان اجرا تزریق کند و ماژول سطح بالا را از پیاده سازی های خاص جدا کند.</p>
</td>
</tr>
</tbody>
</table>

### گام ۴: بررسی مجدد تغییرات مورد نیاز:

۱. در صورت پیاده‌سازی کد به صورت بخش ۳، نیاز به انجام تغییر شماره یک و ۲ نبود. زیرا تنها در سطح پیاده‌سازی تغییر داریم. پس باید مورد ۳ را داشته باشیم و کلاس PhoneOrderService را ایجاد کنیم. 
همچنین مورد ۴ نیز باید انجام شود و توابع دو واسط مربوطه در این کلاس پیاده سازی شود. اما دو مورد ۵ و ۶ تغییری نمی‌کند زیرا هیچ تغییری در سطح واسط نداشتیم. 
مورد ۷ نیز باید انجام شود، زیرا باید کلاس مربوطه یک نمونه داشته باشد، اما باتوجه به رعایت قوانین SOLID دیگر نیازی به داشتن بخش ۸ نیست. 
در نتیجه میتوان گفت موارد ۳و ۴و ۷ را باید داشته باشیم و سایز موارد حذف میشود. 

۲. تعداد تغییرات ۳ تا خواهد شد. 

### گام ۵: جمع بندی:

پس از تغییر کد و رعابت کردن ثوانین SOLID، فرایند تغییر دادن کد و اضافه کردن ویژگی‌های جدید به برنامه بسیار آسان‌تر شد. 
همانطور که در بخش قبل دیدیم، با رعایت قوانین، میزان تغییراتی که برای اضافه کردن یک فیچر جدید نیاز بود نصف شد و در زمان کمتری این پیاده‌سازی قابل انجام بود. 
همچنین برای اضافه کردن فیچر جدید، نیازی به تغییرات گسترده در سایر بخش‌ها نداشتیم و تنها با اضافه کردن یک کلاس و یک خط در مین برنامه، توانستیم فیچر را پیاده‌سازی کنیم. 
این اصول باعث می‌شوند کد تمیزتر، استانداردتر، قابل فهمتر و معمولاً کوتاهتر شود.

رعایت قوانین SOLID باعث می‌شود اعمال تغییرات در کد بسیار آسان‌تر باشد و بتوان فیچر‌های جدید را به راحتی به پروژه اضافه کرد. 


