.class final Llx0/d$d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llx0/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.upload.UploadDataInteractor$upload$1$1"
    f = "UploadDataInteractor.kt"
    l = {
        0x3b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic y:Llx0/d;

.field final synthetic z:Ldt0/c;


# direct methods
.method public constructor <init>(Lec3/m;Llx0/d;Ldt0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Llx0/d;",
            "Ldt0/c;",
            "Lq83/d<",
            "-",
            "Llx0/d$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llx0/d$d$a;->x:Lec3/m;

    iput-object p2, p0, Llx0/d$d$a;->y:Llx0/d;

    iput-object p3, p0, Llx0/d$d$a;->z:Ldt0/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llx0/d$d$a;

    iget-object v1, p0, Llx0/d$d$a;->x:Lec3/m;

    iget-object v2, p0, Llx0/d$d$a;->y:Llx0/d;

    iget-object v3, p0, Llx0/d$d$a;->z:Ldt0/c;

    invoke-direct {v0, v1, v2, v3, p1}, Llx0/d$d$a;-><init>(Lec3/m;Llx0/d;Ldt0/c;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llx0/d$d$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Llx0/d$d$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llx0/d$d$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llx0/d$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llx0/d$d$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llx0/d$d$a;->x:Lec3/m;

    iget-object v1, p0, Llx0/d$d$a;->y:Llx0/d;

    invoke-static {v1}, Llx0/d;->c(Llx0/d;)Lp82/b;

    move-result-object v1

    iget-object v3, p0, Llx0/d$d$a;->z:Ldt0/c;

    invoke-virtual {v1, v3}, Lp82/b;->i(Ldt0/c;)Lec3/l;

    move-result-object v1

    iget-object v3, p0, Llx0/d$d$a;->z:Ldt0/c;

    new-instance v4, Llx0/d$d$a$a;

    invoke-direct {v4, v1, v3}, Llx0/d$d$a$a;-><init>(Lec3/l;Ldt0/c;)V

    iput v2, p0, Llx0/d$d$a;->w:I

    invoke-static {p1, v4, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
