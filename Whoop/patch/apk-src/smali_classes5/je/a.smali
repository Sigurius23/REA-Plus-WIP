.class public final Lje/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/b;


# instance fields
.field public a:I

.field public b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lyf/e;Ls83/c;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Luf/u;

    iget v0, p0, Lje/a;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lje/a;->a:I

    iget-object v0, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast v0, Lvf/b;

    iget-object v1, p1, Luf/u;->a:Ldg/a;

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Luf/i;->e:Lgf/a;

    invoke-static {v1, v2}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "amz-sdk-invocation-id"

    invoke-static {v0, v2, v1}, Ls93/h;->q(Lvf/b;Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lje/a;->a:I

    iget-object v1, p0, Lje/a;->b:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const-string v2, "; max="

    invoke-static {v1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    iget-object v2, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast v2, Lvf/b;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "attempt="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "amz-sdk-request"

    invoke-static {v2, v1, v0}, Ls93/h;->q(Lvf/b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p1, p3}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
