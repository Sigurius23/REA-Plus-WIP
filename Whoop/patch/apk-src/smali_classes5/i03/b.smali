.class public final Li03/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Li03/b;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lod1/a0;",
        "sessionManager",
        "Lcom/whoop/widget/ui/healthspan/a;",
        "healthspanWidgetStateWriter",
        "<init>",
        "(Landroid/content/Context;Lod1/a0;Lcom/whoop/widget/ui/healthspan/a;)V",
        "Ll83/a0;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lod1/a0;",
        "Lcom/whoop/widget/ui/healthspan/a;",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lod1/a0;

.field private final c:Lcom/whoop/widget/ui/healthspan/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lod1/a0;Lcom/whoop/widget/ui/healthspan/a;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthspanWidgetStateWriter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li03/b;->a:Landroid/content/Context;

    iput-object p2, p0, Li03/b;->b:Lod1/a0;

    iput-object p3, p0, Li03/b;->c:Lcom/whoop/widget/ui/healthspan/a;

    return-void
.end method

.method public static final synthetic a(Li03/b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Li03/b;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic b(Li03/b;)Lcom/whoop/widget/ui/healthspan/a;
    .locals 0

    iget-object p0, p0, Li03/b;->c:Lcom/whoop/widget/ui/healthspan/a;

    return-object p0
.end method


# virtual methods
.method public final c(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p1, Li03/b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Li03/b$a;

    iget v1, v0, Li03/b$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Li03/b$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Li03/b$a;

    invoke-direct {v0, p0, p1}, Li03/b$a;-><init>(Li03/b;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Li03/b$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Li03/b$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Li03/b;->b:Lod1/a0;

    invoke-interface {p1}, Lod1/a0;->b()Lec3/t1;

    move-result-object p1

    new-instance v2, Li03/b$b;

    invoke-direct {v2, p0}, Li03/b$b;-><init>(Li03/b;)V

    iput v3, v0, Li03/b$a;->y:I

    invoke-interface {p1, v2, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method
