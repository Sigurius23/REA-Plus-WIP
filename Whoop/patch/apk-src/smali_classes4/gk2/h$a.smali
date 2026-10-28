.class final Lgk2/h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk2/h;-><init>(Landroid/content/Context;Lor2/h1;Lcom/whoop/tombstone/TombstoneApi;Ljs0/c;Lod1/a0;Lcom/whoop/data/local/prefs/PreferenceHelper;Lzr2/a;Lgk2/f;Lbc3/c0;Ltr2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.tombstone.Undertaker$1"
    f = "TombstoneManager.kt"
    l = {
        0x42
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lgk2/h;


# direct methods
.method public constructor <init>(Lgk2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk2/h;",
            "Lq83/d<",
            "-",
            "Lgk2/h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgk2/h$a;->x:Lgk2/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lgk2/h$a;

    iget-object v0, p0, Lgk2/h$a;->x:Lgk2/h;

    invoke-direct {p1, v0, p2}, Lgk2/h$a;-><init>(Lgk2/h;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lgk2/h$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgk2/h$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgk2/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgk2/h$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lgk2/h$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgk2/h$a;->x:Lgk2/h;

    invoke-static {p1}, Lgk2/h;->c(Lgk2/h;)Lod1/a0;

    move-result-object p1

    invoke-interface {p1}, Lod1/a0;->getUserId()I

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lgk2/h$a;->x:Lgk2/h;

    invoke-static {p1}, Lgk2/h;->d(Lgk2/h;)V

    :cond_2
    iget-object p1, p0, Lgk2/h$a;->x:Lgk2/h;

    invoke-static {p1}, Lgk2/h;->b(Lgk2/h;)Lgk2/f;

    move-result-object p1

    invoke-virtual {p1}, Lgk2/f;->a()V

    iget-object p1, p0, Lgk2/h$a;->x:Lgk2/h;

    invoke-static {p1}, Lgk2/h;->c(Lgk2/h;)Lod1/a0;

    move-result-object p1

    invoke-interface {p1}, Lod1/a0;->d()Lec3/t1;

    move-result-object p1

    new-instance v1, Lgk2/h$a$a;

    iget-object v3, p0, Lgk2/h$a;->x:Lgk2/h;

    invoke-direct {v1, v3}, Lgk2/h$a$a;-><init>(Lgk2/h;)V

    iput v2, p0, Lgk2/h$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method
