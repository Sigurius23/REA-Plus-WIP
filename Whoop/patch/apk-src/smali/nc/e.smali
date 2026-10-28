.class public final Lnc/e;
.super Lnc/b;
.source "SourceFile"


# instance fields
.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "NetworkMeteredCtrlr"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Leb/o0;)V
    .locals 1

    const-string v0, "tracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lnc/b;-><init>(Leb/o0;)V

    const/4 p1, 0x7

    iput p1, p0, Lnc/e;->b:I

    return-void
.end method


# virtual methods
.method public final b(Lqc/q;)Z
    .locals 1

    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lqc/q;->j:Lic/e;

    iget-object p1, p1, Lic/e;->a:Lic/x;

    sget-object v0, Lic/x;->E:Lic/x;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lnc/e;->b:I

    return v0
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Lmc/e;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Lmc/e;->a:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Lmc/e;->c:Z

    if-eqz v0, :cond_1

    iget-boolean p1, p1, Lmc/e;->e:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
