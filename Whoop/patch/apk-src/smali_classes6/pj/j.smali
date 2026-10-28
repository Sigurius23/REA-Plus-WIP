.class public final synthetic Lpj/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz63/e;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(JLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lpj/j;->a:Lkotlin/jvm/functions/Function1;

    iput-wide p1, p0, Lpj/j;->b:J

    return-void
.end method


# virtual methods
.method public final a(Lb30/m;Lg9/k;)Ljava/lang/Object;
    .locals 3

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "props"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, La73/d;->e:Lz63/c;

    iget-object p2, p2, Lg9/k;->a:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, Lpj/j;->a:Lkotlin/jvm/functions/Function1;

    iget-wide v0, p0, Lpj/j;->b:J

    if-eqz p2, :cond_0

    new-instance v2, Lpj/k;

    invoke-direct {v2, p1, p2, v0, v1}, Lpj/k;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;J)V

    filled-new-array {v2}, [Lpj/k;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, Landroid/text/style/URLSpan;

    invoke-direct {p2, p1}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v0

    invoke-direct {p1, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    filled-new-array {p2, p1}, [Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
