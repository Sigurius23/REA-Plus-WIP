.class public Lcom/mapbox/maps/MapboxStyleManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0016\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010\u001b\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008!\u0010\u001fJ?\u0010%\u001a*\u0012\u0004\u0012\u00020\n\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\"j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#`$0\u001c2\u0006\u0010\u001b\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008%\u0010\u001fJ+\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008\'\u0010(JG\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\"\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\"j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 `$H\u0017\u00a2\u0006\u0004\u0008*\u0010+J3\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008-\u0010.J]\u00102\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u0001`$2\u0008\u00101\u001a\u0004\u0018\u000100H\u0017\u00a2\u0006\u0004\u00082\u00103J]\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u0001`$2\u0008\u00101\u001a\u0004\u0018\u000100H\u0017\u00a2\u0006\u0004\u00085\u00103JS\u00106\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u0001`$H\u0017\u00a2\u0006\u0004\u00086\u00107JS\u00108\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u00010\"j\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0018\u0001`$H\u0017\u00a2\u0006\u0004\u00088\u00107J-\u00109\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0008\u00101\u001a\u0004\u0018\u000100H\u0017\u00a2\u0006\u0004\u00089\u0010:J-\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010;\u001a\u00020 2\u0008\u0010=\u001a\u0004\u0018\u00010<H\u0017\u00a2\u0006\u0004\u0008>\u0010?J5\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\n2\u0006\u0010B\u001a\u00020A2\u0008\u0010C\u001a\u0004\u0018\u00010<H\u0017\u00a2\u0006\u0004\u0008D\u0010EJ-\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 2\u0008\u0010C\u001a\u0004\u0018\u00010<H\u0017\u00a2\u0006\u0004\u0008G\u0010?J5\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\n2\u0006\u0010B\u001a\u00020A2\u0008\u0010C\u001a\u0004\u0018\u00010<H\u0017\u00a2\u0006\u0004\u0008H\u0010EJ#\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020I0\u001c2\u0006\u0010@\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008J\u0010\u001fJ#\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008K\u0010\u001fJ-\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\n2\u0008\u0010C\u001a\u0004\u0018\u00010<H\u0017\u00a2\u0006\u0004\u0008L\u0010MJ\u0017\u0010N\u001a\u00020I2\u0006\u0010@\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008N\u0010OJ\u001f\u0010Q\u001a\u00020#2\u0006\u0010@\u001a\u00020\n2\u0006\u0010P\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008Q\u0010RJ3\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008S\u0010.J#\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010@\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008T\u0010\u001fJ+\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010@\u001a\u00020\n2\u0006\u0010F\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008U\u0010VJ+\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010F\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008X\u0010VJ\u001f\u0010Y\u001a\u00020#2\u0006\u0010W\u001a\u00020\n2\u0006\u0010P\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008Y\u0010RJ3\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008Z\u0010.J#\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010W\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008[\u0010\u001fJ+\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010F\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008\\\u0010VJ9\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\u000c\u0010_\u001a\u0008\u0012\u0004\u0012\u00020^0\u0017H\u0017\u00a2\u0006\u0004\u0008`\u0010aJ9\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\u000c\u0010_\u001a\u0008\u0012\u0004\u0012\u00020^0\u0017H\u0017\u00a2\u0006\u0004\u0008b\u0010aJ9\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\u000c\u0010c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0017H\u0017\u00a2\u0006\u0004\u0008d\u0010aJ+\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010f\u001a\u00020eH\u0017\u00a2\u0006\u0004\u0008g\u0010hJ#\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008i\u0010\u001fJ#\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008j\u0010\u001fJ\u0017\u0010k\u001a\u00020I2\u0006\u0010W\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008k\u0010OJ#\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008l\u0010mJ\u0017\u0010n\u001a\u00020#2\u0006\u0010P\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008n\u0010oJ+\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008p\u0010VJ#\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008q\u0010mJ\u0017\u0010r\u001a\u00020#2\u0006\u0010P\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008r\u0010oJ+\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008s\u0010VJ#\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008t\u0010mJ\u0017\u0010u\u001a\u00020#2\u0006\u0010P\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008u\u0010oJ+\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008v\u0010VJ#\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008w\u0010mJ\u0017\u0010x\u001a\u00020#2\u0006\u0010P\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008x\u0010oJ+\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008y\u0010VJ#\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010F\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008z\u0010mJ\u0017\u0010{\u001a\u00020#2\u0006\u0010P\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008{\u0010oJ+\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017\u00a2\u0006\u0004\u0008|\u0010VJ\u0019\u0010~\u001a\u0004\u0018\u00010e2\u0006\u0010}\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008~\u0010\u007fJl\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\u00042\u0006\u0010f\u001a\u00020e2\u0007\u0010\u0081\u0001\u001a\u00020I2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010\u00172\u000e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010\u00172\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0017\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0088\u0001J%\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\nH\u0017\u00a2\u0006\u0005\u0008\u0089\u0001\u0010\u001fJ\u0019\u0010\u008a\u0001\u001a\u00020I2\u0006\u0010}\u001a\u00020\nH\u0017\u00a2\u0006\u0005\u0008\u008a\u0001\u0010OJ0\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0008\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0017\u00a2\u0006\u0006\u0008\u008d\u0001\u0010\u008e\u0001J@\u0010\u0093\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0008\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u000e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020^0\u0091\u0001H\u0017\u00a2\u0006\u0006\u0008\u0093\u0001\u0010\u0094\u0001J0\u0010\u0095\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0008\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0017\u00a2\u0006\u0006\u0008\u0095\u0001\u0010\u0096\u0001J0\u0010\u0099\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0008\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0017\u00a2\u0006\u0006\u0008\u0099\u0001\u0010\u009a\u0001J\u0012\u0010\u009b\u0001\u001a\u00020IH\u0017\u00a2\u0006\u0006\u0008\u009b\u0001\u0010\u009c\u0001J0\u0010\u009e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0008\u0010\u008c\u0001\u001a\u00030\u009d\u0001H\u0017\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009f\u0001J6\u0010\u00a2\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u000e\u0010\u00a1\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a0\u00010\u0017H\u0017\u00a2\u0006\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001J\"\u0010\u00a5\u0001\u001a\u00020#2\u0007\u0010\u00a4\u0001\u001a\u00020\n2\u0006\u0010P\u001a\u00020\nH\u0017\u00a2\u0006\u0005\u0008\u00a5\u0001\u0010RJ6\u0010\u00a6\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0007\u0010\u00a4\u0001\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010,\u001a\u00020 H\u0017\u00a2\u0006\u0005\u0008\u00a6\u0001\u0010.J\u0018\u0010\u00a7\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0091\u0001H\u0017\u00a2\u0006\u0005\u0008\u00a7\u0001\u0010\u001aJ&\u0010\u00a9\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0007\u0010\u00a8\u0001\u001a\u00020 H\u0017\u00a2\u0006\u0005\u0008\u00a9\u0001\u0010mJ/\u0010\u00ac\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0007\u0010\u00aa\u0001\u001a\u00020\n2\u0007\u0010\u00ab\u0001\u001a\u00020\nH\u0017\u00a2\u0006\u0005\u0008\u00ac\u0001\u0010(J&\u0010\u00ad\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0007\u0010\u00aa\u0001\u001a\u00020\nH\u0017\u00a2\u0006\u0005\u0008\u00ad\u0001\u0010\u001fJ\u001a\u0010\u00ae\u0001\u001a\u00020I2\u0007\u0010\u00aa\u0001\u001a\u00020\nH\u0017\u00a2\u0006\u0005\u0008\u00ae\u0001\u0010OJ8\u0010\u00b1\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010W\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\u0008\u0010\u00b0\u0001\u001a\u00030\u00af\u0001H\u0017\u00a2\u0006\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001J7\u0010\u00b3\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\n2\u0006\u0010f\u001a\u00020e2\u0007\u0010\u0081\u0001\u001a\u00020IH\u0007\u00a2\u0006\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001J-\u0010\u00b3\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\n2\u0006\u0010f\u001a\u00020eH\u0007\u00a2\u0006\u0005\u0008\u00b3\u0001\u0010hJ9\u0010\u00b3\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\n2\u0008\u0010\u00b6\u0001\u001a\u00030\u00b5\u00012\u0007\u0010\u0081\u0001\u001a\u00020IH\u0007\u00a2\u0006\u0006\u0008\u00b3\u0001\u0010\u00b7\u0001J0\u0010\u00b3\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010}\u001a\u00020\n2\u0008\u0010\u00b6\u0001\u001a\u00030\u00b5\u0001H\u0007\u00a2\u0006\u0006\u0008\u00b3\u0001\u0010\u00b8\u0001J\u0018\u0010\u00ba\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b9\u00010\u0017H\u0017\u00a2\u0006\u0005\u0008\u00ba\u0001\u0010\u001aJ\u0012\u0010\u00bb\u0001\u001a\u00020\u000eH\u0017\u00a2\u0006\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001J*\u0010\u00bf\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\n\u0010\u00be\u0001\u001a\u0005\u0018\u00010\u00bd\u0001H\u0017\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001J&\u0010\u00bf\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0007\u0010\u00c1\u0001\u001a\u00020\nH\u0017\u00a2\u0006\u0005\u0008\u00bf\u0001\u0010\u001fJ(\u0010\u00bf\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0008\u0010\u00b6\u0001\u001a\u00030\u00b5\u0001H\u0017\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00c2\u0001J&\u0010\u00bf\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010f\u001a\u00020eH\u0017\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00c3\u0001J2\u0010\u00c4\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\n\u0010\u00be\u0001\u001a\u0005\u0018\u00010\u00bd\u0001H\u0017\u00a2\u0006\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001J.\u0010\u00c4\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0007\u0010\u00c1\u0001\u001a\u00020\nH\u0017\u00a2\u0006\u0005\u0008\u00c4\u0001\u0010(J0\u0010\u00c4\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0008\u0010\u00b6\u0001\u001a\u00030\u00b5\u0001H\u0017\u00a2\u0006\u0006\u0008\u00c4\u0001\u0010\u00b8\u0001J-\u0010\u00c4\u0001\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010f\u001a\u00020eH\u0017\u00a2\u0006\u0005\u0008\u00c4\u0001\u0010hR\u001a\u0010\u0003\u001a\u00020\u00028\u0007\u00a2\u0006\u000f\n\u0005\u0008\u0003\u0010\u00c6\u0001\u001a\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0005\u0010\u00c9\u0001\u001a\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001R\u001a\u0010\u0007\u001a\u00020\u00068\u0007\u00a2\u0006\u000f\n\u0005\u0008\u0007\u0010\u00cc\u0001\u001a\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001R\u0018\u0010\u00d2\u0001\u001a\u00030\u00cf\u00018WX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00d0\u0001\u0010\u00d1\u0001R\u0016\u0010\u00d4\u0001\u001a\u00020\n8WX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d3\u0001\u0010\u000cR\u0016\u0010\u00d6\u0001\u001a\u00020\n8WX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d5\u0001\u0010\u000cR\u001c\u0010\u00d8\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178WX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d7\u0001\u0010\u001aR$\u0010\u00db\u0001\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00178WX\u0097\u0004\u00a2\u0006\u000f\u0012\u0006\u0008\u00da\u0001\u0010\u00bc\u0001\u001a\u0005\u0008\u00d9\u0001\u0010\u001aR\u001c\u0010\u00dd\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178WX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00dc\u0001\u0010\u001a\u00a8\u0006\u00de\u0001"
    }
    d2 = {
        "Lcom/mapbox/maps/MapboxStyleManager;",
        "",
        "Lcom/mapbox/maps/StyleManager;",
        "styleManager",
        "",
        "pixelRatio",
        "Lcom/mapbox/maps/MapLoadingErrorDelegate;",
        "mapLoadingErrorDelegate",
        "<init>",
        "(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V",
        "",
        "getStyleGlyphURL",
        "()Ljava/lang/String;",
        "url",
        "Ll83/a0;",
        "setStyleGlyphURL",
        "(Ljava/lang/String;)V",
        "Lcom/mapbox/maps/TransitionOptions;",
        "getStyleTransition",
        "()Lcom/mapbox/maps/TransitionOptions;",
        "transitionOptions",
        "setStyleTransition",
        "(Lcom/mapbox/maps/TransitionOptions;)V",
        "",
        "Lcom/mapbox/maps/StyleObjectInfo;",
        "getStyleImports",
        "()Ljava/util/List;",
        "importId",
        "Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/bindgen/None;",
        "removeStyleImport",
        "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/bindgen/Value;",
        "getStyleImportSchema",
        "Ljava/util/HashMap;",
        "Lcom/mapbox/maps/StylePropertyValue;",
        "Lkotlin/collections/HashMap;",
        "getStyleImportConfigProperties",
        "config",
        "getStyleImportConfigProperty",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;",
        "configs",
        "setStyleImportConfigProperties",
        "(Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;",
        "value",
        "setStyleImportConfigProperty",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;",
        "json",
        "Lcom/mapbox/maps/ImportPosition;",
        "importPosition",
        "addStyleImportFromJSON",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;",
        "uri",
        "addStyleImportFromURI",
        "updateStyleImportWithJSON",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;",
        "updateStyleImportWithURI",
        "moveStyleImport",
        "(Ljava/lang/String;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;",
        "parameters",
        "Lcom/mapbox/maps/LayerPosition;",
        "position",
        "addStyleLayer",
        "(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;",
        "layerId",
        "Lcom/mapbox/maps/CustomLayerHost;",
        "layerHost",
        "layerPosition",
        "addStyleCustomLayer",
        "(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;",
        "properties",
        "addPersistentStyleLayer",
        "addPersistentStyleCustomLayer",
        "",
        "isStyleLayerPersistent",
        "removeStyleLayer",
        "moveStyleLayer",
        "(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;",
        "styleLayerExists",
        "(Ljava/lang/String;)Z",
        "property",
        "getStyleLayerProperty",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;",
        "setStyleLayerProperty",
        "getStyleLayerProperties",
        "setStyleLayerProperties",
        "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;",
        "sourceId",
        "addStyleSource",
        "getStyleSourceProperty",
        "setStyleSourceProperty",
        "getStyleSourceProperties",
        "setStyleSourceProperties",
        "dataId",
        "Lcom/mapbox/geojson/Feature;",
        "features",
        "addGeoJSONSourceFeatures",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;",
        "updateGeoJSONSourceFeatures",
        "featureIds",
        "removeGeoJSONSourceFeatures",
        "Lcom/mapbox/maps/Image;",
        "image",
        "updateStyleImageSourceImage",
        "(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;",
        "removeStyleSource",
        "removeStyleSourceUnchecked",
        "styleSourceExists",
        "setStyleAtmosphere",
        "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;",
        "getStyleAtmosphereProperty",
        "(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;",
        "setStyleAtmosphereProperty",
        "setStyleSnow",
        "getStyleSnowProperty",
        "setStyleSnowProperty",
        "setStyleRain",
        "getStyleRainProperty",
        "setStyleRainProperty",
        "setStyleTerrain",
        "getStyleTerrainProperty",
        "setStyleTerrainProperty",
        "setStyleProjection",
        "getStyleProjectionProperty",
        "setStyleProjectionProperty",
        "imageId",
        "getStyleImage",
        "(Ljava/lang/String;)Lcom/mapbox/maps/Image;",
        "scale",
        "sdf",
        "Lcom/mapbox/maps/ImageStretches;",
        "stretchX",
        "stretchY",
        "Lcom/mapbox/maps/ImageContent;",
        "content",
        "addStyleImage",
        "(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;",
        "removeStyleImage",
        "hasStyleImage",
        "Lcom/mapbox/maps/CustomGeometrySourceOptions;",
        "options",
        "addStyleCustomGeometrySource",
        "(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/CanonicalTileID;",
        "tileId",
        "",
        "featureCollection",
        "setStyleCustomGeometrySourceTileData",
        "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;",
        "invalidateStyleCustomGeometrySourceTile",
        "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/CoordinateBounds;",
        "coordinateBounds",
        "invalidateStyleCustomGeometrySourceRegion",
        "(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;",
        "isStyleLoaded",
        "()Z",
        "Lcom/mapbox/maps/CustomRasterSourceOptions;",
        "addStyleCustomRasterSource",
        "(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/CustomRasterSourceTileData;",
        "tiles",
        "setStyleCustomRasterSourceTileData",
        "(Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;",
        "id",
        "getStyleLightProperty",
        "setStyleLightProperty",
        "getStyleLights",
        "lights",
        "setStyleLights",
        "modelId",
        "modelUri",
        "addStyleModel",
        "removeStyleModel",
        "hasStyleModel",
        "Lcom/mapbox/maps/GeoJSONSourceData;",
        "data",
        "setStyleGeoJSONSourceData",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;",
        "addImage",
        "(Ljava/lang/String;Lcom/mapbox/maps/Image;Z)Lcom/mapbox/bindgen/Expected;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "(Ljava/lang/String;Landroid/graphics/Bitmap;Z)Lcom/mapbox/bindgen/Expected;",
        "(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/FeaturesetDescriptor;",
        "getFeaturesets",
        "setInitialStyleColorTheme",
        "()V",
        "Lcom/mapbox/maps/ColorTheme;",
        "colorTheme",
        "setStyleColorTheme",
        "(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;",
        "base64",
        "(Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;",
        "(Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;",
        "setImportColorTheme",
        "(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/StyleManager;",
        "getStyleManager",
        "()Lcom/mapbox/maps/StyleManager;",
        "F",
        "getPixelRatio",
        "()F",
        "Lcom/mapbox/maps/MapLoadingErrorDelegate;",
        "getMapLoadingErrorDelegate",
        "()Lcom/mapbox/maps/MapLoadingErrorDelegate;",
        "Lcom/mapbox/maps/CameraOptions;",
        "getStyleDefaultCamera",
        "()Lcom/mapbox/maps/CameraOptions;",
        "styleDefaultCamera",
        "getStyleURI",
        "styleURI",
        "getStyleJSON",
        "styleJSON",
        "getStyleLayers",
        "styleLayers",
        "getStyleSlots",
        "getStyleSlots$annotations",
        "styleSlots",
        "getStyleSources",
        "styleSources",
        "sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final mapLoadingErrorDelegate:Lcom/mapbox/maps/MapLoadingErrorDelegate;

.field private final pixelRatio:F

.field private final styleManager:Lcom/mapbox/maps/StyleManager;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V
    .locals 1

    const-string v0, "styleManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapLoadingErrorDelegate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    iput p2, p0, Lcom/mapbox/maps/MapboxStyleManager;->pixelRatio:F

    iput-object p3, p0, Lcom/mapbox/maps/MapboxStyleManager;->mapLoadingErrorDelegate:Lcom/mapbox/maps/MapLoadingErrorDelegate;

    return-void
.end method

.method public static synthetic getStyleSlots$annotations()V
    .locals 0
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    return-void
.end method


# virtual methods
.method public addGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Feature;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "features"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->addGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addGeoJSONS\u2026urceId, dataId, features)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final addImage(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, p2, v0}, Lcom/mapbox/maps/MapboxStyleManager;->addImage(Ljava/lang/String;Landroid/graphics/Bitmap;Z)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public final addImage(Ljava/lang/String;Landroid/graphics/Bitmap;Z)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            "Z)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p2}, Lcom/mapbox/maps/ExtensionUtils;->toMapboxImage(Landroid/graphics/Bitmap;)Lcom/mapbox/maps/Image;

    move-result-object p2

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->addImage(Ljava/lang/String;Lcom/mapbox/maps/Image;Z)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public final addImage(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/Image;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/mapbox/maps/MapboxStyleManager;->addImage(Ljava/lang/String;Lcom/mapbox/maps/Image;Z)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public final addImage(Ljava/lang/String;Lcom/mapbox/maps/Image;Z)Lcom/mapbox/bindgen/Expected;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/Image;",
            "Z)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v3, p0, Lcom/mapbox/maps/MapboxStyleManager;->pixelRatio:F

    sget-object v6, Lm83/y;->w:Lm83/y;

    const/4 v8, 0x0

    move-object v7, v6

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move v5, p3

    invoke-virtual/range {v1 .. v8}, Lcom/mapbox/maps/MapboxStyleManager;->addStyleImage(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public addPersistentStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomLayerHost;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layerHost"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->addPersistentStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addPersiste\u2026layerHost, layerPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public addPersistentStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addPersistentStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addPersiste\u2026roperties, layerPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public addStyleCustomGeometrySource(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomGeometrySourceOptions;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addStyleCustomGeometrySource(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addStyleCus\u2026Source(sourceId, options)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public addStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomLayerHost;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layerHost"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->addStyleCustomLayer(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addStyleCus\u2026layerHost, layerPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public addStyleCustomRasterSource(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CustomRasterSourceOptions;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addStyleCustomRasterSource(Ljava/lang/String;Lcom/mapbox/maps/CustomRasterSourceOptions;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addStyleCus\u2026Source(sourceId, options)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public addStyleImage(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "F",
            "Lcom/mapbox/maps/Image;",
            "Z",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ImageStretches;",
            ">;",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/ImageStretches;",
            ">;",
            "Lcom/mapbox/maps/ImageContent;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stretchX"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stretchY"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v1, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-virtual/range {v1 .. v8}, Lcom/mapbox/maps/StyleManager;->addStyleImage(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addStyleIma\u2026etchX, stretchY, content)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public addStyleImportFromJSON(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;",
            "Lcom/mapbox/maps/ImportPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/mapbox/maps/StyleManager;->addStyleImportFromJSON(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addStyleImp\u2026, config, importPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public addStyleImportFromURI(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;",
            "Lcom/mapbox/maps/ImportPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/mapbox/maps/StyleManager;->addStyleImportFromURI(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addStyleImp\u2026, config, importPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public addStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "parameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addStyleLayer(parameters, position)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public addStyleModel(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "modelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelUri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addStyleModel(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addStyleModel(modelId, modelUri)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public addStyleSource(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->addStyleSource(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.addStyleSource(sourceId, properties)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getFeaturesets()Ljava/util/List;
    .locals 2
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/FeaturesetDescriptor;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleFeaturesets()Ljava/util/List;

    move-result-object v0

    const-string v1, "styleManager.styleFeaturesets"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getMapLoadingErrorDelegate()Lcom/mapbox/maps/MapLoadingErrorDelegate;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->mapLoadingErrorDelegate:Lcom/mapbox/maps/MapLoadingErrorDelegate;

    return-object v0
.end method

.method public final getPixelRatio()F
    .locals 1

    iget v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->pixelRatio:F

    return v0
.end method

.method public getStyleAtmosphereProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleAtmosphereProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string v0, "styleManager.getStyleAtmosphereProperty(property)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleDefaultCamera()Lcom/mapbox/maps/CameraOptions;
    .locals 2

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleDefaultCamera()Lcom/mapbox/maps/CameraOptions;

    move-result-object v0

    const-string v1, "styleManager.styleDefaultCamera"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getStyleGlyphURL()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleGlyphURL()Ljava/lang/String;

    move-result-object v0

    const-string v1, "styleManager.styleGlyphURL"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getStyleImage(Ljava/lang/String;)Lcom/mapbox/maps/Image;
    .locals 1

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleImage(Ljava/lang/String;)Lcom/mapbox/maps/Image;

    move-result-object p1

    return-object p1
.end method

.method public getStyleImportConfigProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/StylePropertyValue;",
            ">;>;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleImportConfigProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.getStyleImp\u2026onfigProperties(importId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleImportConfigProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/StylePropertyValue;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->getStyleImportConfigProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.getStyleImp\u2026roperty(importId, config)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleImportSchema(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleImportSchema(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.getStyleImportSchema(importId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleImports()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleImports()Ljava/util/List;

    move-result-object v0

    const-string v1, "styleManager.styleImports"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getStyleJSON()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleJSON()Ljava/lang/String;

    move-result-object v0

    const-string v1, "styleManager.styleJSON"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getStyleLayerProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleLayerProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.getStyleLayerProperties(layerId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->getStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string p2, "styleManager.getStyleLay\u2026operty(layerId, property)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleLayers()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleLayers()Ljava/util/List;

    move-result-object v0

    const-string v1, "styleManager.styleLayers"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getStyleLightProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->getStyleLightProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string p2, "styleManager.getStyleLightProperty(id, property)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleLights()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleLights()Ljava/util/List;

    move-result-object v0

    const-string v1, "styleManager.styleLights"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getStyleManager()Lcom/mapbox/maps/StyleManager;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    return-object v0
.end method

.method public getStyleProjectionProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleProjectionProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string v0, "styleManager.getStyleProjectionProperty(property)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStyleRainProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleRainProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string v0, "styleManager.getStyleRainProperty(property)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleSlots()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleSlots()Ljava/util/List;

    move-result-object v0

    const-string v1, "styleManager.styleSlots"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getStyleSnowProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleSnowProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string v0, "styleManager.getStyleSnowProperty(property)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleSourceProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleSourceProperties(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.getStyleSourceProperties(sourceId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->getStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string p2, "styleManager.getStyleSou\u2026perty(sourceId, property)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleSources()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/StyleObjectInfo;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleSources()Ljava/util/List;

    move-result-object v0

    const-string v1, "styleManager.styleSources"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getStyleTerrainProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->getStyleTerrainProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object p1

    const-string v0, "styleManager.getStyleTerrainProperty(property)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getStyleTransition()Lcom/mapbox/maps/TransitionOptions;
    .locals 2

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleTransition()Lcom/mapbox/maps/TransitionOptions;

    move-result-object v0

    const-string v1, "styleManager.styleTransition"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getStyleURI()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->getStyleURI()Ljava/lang/String;

    move-result-object v0

    const-string v1, "styleManager.styleURI"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public hasStyleImage(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->hasStyleImage(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public hasStyleModel(Ljava/lang/String;)Z
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "modelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->hasStyleModel(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public invalidateStyleCustomGeometrySourceRegion(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CoordinateBounds;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinateBounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->invalidateStyleCustomGeometrySourceRegion(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.invalidateS\u2026urceId, coordinateBounds)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public invalidateStyleCustomGeometrySourceTile(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CanonicalTileID;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tileId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->invalidateStyleCustomGeometrySourceTile(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.invalidateS\u2026rceTile(sourceId, tileId)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public isStyleLayerPersistent(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->isStyleLayerPersistent(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.isStyleLayerPersistent(layerId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public isStyleLoaded()Z
    .locals 1

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->isStyleLoaded()Z

    move-result v0

    return v0
.end method

.method public moveStyleImport(Ljava/lang/String;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/ImportPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->moveStyleImport(Ljava/lang/String;Lcom/mapbox/maps/ImportPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.moveStyleIm\u2026importId, importPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public moveStyleLayer(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/LayerPosition;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->moveStyleLayer(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.moveStyleLa\u2026r(layerId, layerPosition)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public removeGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->removeGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.removeGeoJS\u2026ceId, dataId, featureIds)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public removeStyleImage(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "imageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->removeStyleImage(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.removeStyleImage(imageId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public removeStyleImport(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->removeStyleImport(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.removeStyleImport(importId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public removeStyleLayer(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->removeStyleLayer(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.removeStyleLayer(layerId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public removeStyleModel(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "modelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->removeStyleModel(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.removeStyleModel(modelId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public removeStyleSource(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->removeStyleSource(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.removeStyleSource(sourceId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public removeStyleSourceUnchecked(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->removeStyleSourceUnchecked(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.removeStyleSourceUnchecked(sourceId)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setImportColorTheme(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-static {p2}, Lcom/mapbox/maps/ExtensionUtils;->toMapboxImage(Landroid/graphics/Bitmap;)Lcom/mapbox/maps/Image;

    move-result-object p2

    invoke-static {p2}, Lcom/mapbox/maps/ColorTheme;->valueOf(Lcom/mapbox/maps/Image;)Lcom/mapbox/maps/ColorTheme;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setImportColorTheme(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setImportColorTheme(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/ColorTheme;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setImportColorTheme(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setImportCo\u2026eme(importId, colorTheme)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setImportColorTheme(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/Image;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-static {p2}, Lcom/mapbox/maps/ColorTheme;->valueOf(Lcom/mapbox/maps/Image;)Lcom/mapbox/maps/ColorTheme;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setImportColorTheme(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setImportColorTheme(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 2
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "base64"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/mapbox/maps/StylePropertyValue;

    .line 4
    invoke-static {p2}, Lcom/mapbox/bindgen/Value;->valueOf(Ljava/lang/String;)Lcom/mapbox/bindgen/Value;

    move-result-object p2

    sget-object v1, Lcom/mapbox/maps/StylePropertyValueKind;->CONSTANT:Lcom/mapbox/maps/StylePropertyValueKind;

    .line 5
    invoke-direct {v0, p2, v1}, Lcom/mapbox/maps/StylePropertyValue;-><init>(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/StylePropertyValueKind;)V

    .line 6
    invoke-static {v0}, Lcom/mapbox/maps/ColorTheme;->valueOf(Lcom/mapbox/maps/StylePropertyValue;)Lcom/mapbox/maps/ColorTheme;

    move-result-object p2

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setImportColorTheme(Ljava/lang/String;Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setInitialStyleColorTheme()V
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0}, Lcom/mapbox/maps/StyleManager;->setInitialStyleColorTheme()V

    return-void
.end method

.method public setStyleAtmosphere(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleAtmosphere(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.setStyleAtmosphere(properties)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleAtmosphereProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleAtmosphereProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleAtm\u2026Property(property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleColorTheme(Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-static {p1}, Lcom/mapbox/maps/ExtensionUtils;->toMapboxImage(Landroid/graphics/Bitmap;)Lcom/mapbox/maps/Image;

    move-result-object p1

    invoke-static {p1}, Lcom/mapbox/maps/ColorTheme;->valueOf(Lcom/mapbox/maps/Image;)Lcom/mapbox/maps/ColorTheme;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleColorTheme(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleColorTheme(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ColorTheme;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleColorTheme(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.setStyleColorTheme(colorTheme)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleColorTheme(Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/Image;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-static {p1}, Lcom/mapbox/maps/ColorTheme;->valueOf(Lcom/mapbox/maps/Image;)Lcom/mapbox/maps/ColorTheme;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleColorTheme(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleColorTheme(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;
    .locals 2
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "base64"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/mapbox/maps/StylePropertyValue;

    .line 4
    invoke-static {p1}, Lcom/mapbox/bindgen/Value;->valueOf(Ljava/lang/String;)Lcom/mapbox/bindgen/Value;

    move-result-object p1

    sget-object v1, Lcom/mapbox/maps/StylePropertyValueKind;->CONSTANT:Lcom/mapbox/maps/StylePropertyValueKind;

    .line 5
    invoke-direct {v0, p1, v1}, Lcom/mapbox/maps/StylePropertyValue;-><init>(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/StylePropertyValueKind;)V

    .line 6
    invoke-static {v0}, Lcom/mapbox/maps/ColorTheme;->valueOf(Lcom/mapbox/maps/StylePropertyValue;)Lcom/mapbox/maps/ColorTheme;

    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleColorTheme(Lcom/mapbox/maps/ColorTheme;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    return-object p1
.end method

.method public setStyleCustomGeometrySourceTileData(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/CanonicalTileID;",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Feature;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tileId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureCollection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleCustomGeometrySourceTileData(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleCus\u2026ileId, featureCollection)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleCustomRasterSourceTileData(Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/mapbox/maps/CustomRasterSourceTileData;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleCustomRasterSourceTileData(Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleCus\u2026TileData(sourceId, tiles)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleGeoJSONSourceData(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/GeoJSONSourceData;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleGeoJSONSourceData(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleGeo\u2026a(sourceId, dataId, data)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleGlyphURL(Ljava/lang/String;)V
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleGlyphURL(Ljava/lang/String;)V

    return-void
.end method

.method public setStyleImportConfigProperties(Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleImportConfigProperties(Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleImp\u2026erties(importId, configs)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleImportConfigProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleImportConfigProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleImp\u2026(importId, config, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleLayerProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleLayerProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleLay\u2026ties(layerId, properties)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleLay\u2026layerId, property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleLightProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleLightProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleLig\u2026erty(id, property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleLights(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "lights"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleLights(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.setStyleLights(lights)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleProjection(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleProjection(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.setStyleProjection(properties)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleProjectionProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleProjectionProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStylePro\u2026Property(property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleRain(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleRain(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.setStyleRain(properties)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setStyleRainProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleRainProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleRainProperty(property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleSnow(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleSnow(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.setStyleSnow(properties)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleSnowProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleSnowProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleSnowProperty(property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleSourceProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleSourceProperties(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleSou\u2026ies(sourceId, properties)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->setStyleSourceProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleSou\u2026ourceId, property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleTerrain(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleTerrain(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "styleManager.setStyleTerrain(properties)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleTerrainProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->setStyleTerrainProperty(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.setStyleTer\u2026Property(property, value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setStyleTransition(Lcom/mapbox/maps/TransitionOptions;)V
    .locals 1

    const-string v0, "transitionOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->setStyleTransition(Lcom/mapbox/maps/TransitionOptions;)V

    return-void
.end method

.method public styleLayerExists(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->styleLayerExists(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public styleSourceExists(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/StyleManager;->styleSourceExists(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public updateGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/mapbox/geojson/Feature;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "features"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->updateGeoJSONSourceFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.updateGeoJS\u2026urceId, dataId, features)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public updateStyleImageSourceImage(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/Image;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/StyleManager;->updateStyleImageSourceImage(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.updateStyle\u2026rceImage(sourceId, image)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public updateStyleImportWithJSON(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->updateStyleImportWithJSON(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.updateStyle\u2026ortId, json, config\n    )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public updateStyleImportWithURI(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            ">;)",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/None;",
            ">;"
        }
    .end annotation

    const-string v0, "importId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/maps/ThreadChecker;->INSTANCE:Lcom/mapbox/maps/ThreadChecker;

    invoke-virtual {v0}, Lcom/mapbox/maps/ThreadChecker;->throwIfNotMainThread()V

    iget-object v0, p0, Lcom/mapbox/maps/MapboxStyleManager;->styleManager:Lcom/mapbox/maps/StyleManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/StyleManager;->updateStyleImportWithURI(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string p2, "styleManager.updateStyle\u2026RI(importId, uri, config)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
