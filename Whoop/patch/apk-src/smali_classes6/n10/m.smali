.class public final Ln10/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln10/h0;


# instance fields
.field public final a:Ln10/l;


# direct methods
.method public constructor <init>(Ln10/l;)V
    .locals 1

    const-string v0, "customerSheetConfirmationInterceptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln10/m;->a:Ln10/l;

    return-void
.end method


# virtual methods
.method public final a(Lv00/a0;Ljava/lang/String;Ljava/lang/String;Ly00/n;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of p2, p1, Lv00/u;

    if-eqz p2, :cond_0

    move-object v2, p1

    check-cast v2, Lv00/u;

    iget-object p1, p0, Ln10/m;->a:Ln10/l;

    iget-object p1, p1, Ln10/l;->a:Lb30/m;

    iget-object p2, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast p2, Lb10/a1;

    invoke-virtual {p2}, Lb10/a1;->get()Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Lb10/c1;

    iget-object p2, p1, Lb30/m;->y:Ljava/lang/Object;

    check-cast p2, Lb20/g;

    invoke-virtual {p2}, Lb20/g;->get()Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Lyy/f;

    iget-object p2, p1, Lb30/m;->z:Ljava/lang/Object;

    check-cast p2, Le20/a;

    invoke-virtual {p2}, Le20/a;->get()Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Lqg3/d;

    iget-object p2, p1, Lb30/m;->E:Ljava/lang/Object;

    check-cast p2, Lb10/c;

    invoke-virtual {p2}, Lb10/c;->get()Ljava/lang/Object;

    move-result-object p2

    move-object v6, p2

    check-cast v6, Lla/b;

    iget-object p1, p1, Lb30/m;->F:Ljava/lang/Object;

    check-cast p1, Lcy/b;

    invoke-virtual {p1}, Lcy/b;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lqy/d;

    new-instance v0, Ln10/k;

    move-object v1, p4

    invoke-direct/range {v0 .. v7}, Ln10/k;-><init>(Ly00/n;Lv00/u;Lb10/c1;Lyy/f;Lqg3/d;Lla/b;Lqy/d;)V

    return-object v0

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p3, " is not supported by Customer Sheet!"

    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
