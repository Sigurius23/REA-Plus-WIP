.class public final Lb23/a;
.super Lb23/f;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 4

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-eq p1, v1, :cond_0

    const/4 v1, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v2, :cond_3

    const/4 v2, 0x6

    if-eq p1, v1, :cond_0

    if-eq p1, v0, :cond_1

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    const/4 v0, 0x7

    goto :goto_0

    :cond_2
    move v0, v1

    :cond_3
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "("

    const-string v2, ") "

    invoke-static {v1, p1, v2, p3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p4, :cond_5

    invoke-virtual {p4}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {p4}, Lpf/c;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p3

    const-string p4, "\n"

    invoke-static {p1, p4, p3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, p3

    :cond_5
    :goto_1
    invoke-static {v0, p2, p1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    return-void
.end method
