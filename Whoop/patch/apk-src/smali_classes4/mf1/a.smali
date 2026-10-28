.class public final Lmf1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmf1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lmf1/a;",
        "Lud3/g0;",
        "Lhf1/b;",
        "experimentsChecker",
        "<init>",
        "(Lhf1/b;)V",
        "Lud3/f0;",
        "chain",
        "Lud3/x0;",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "w",
        "Lhf1/b;",
        "x",
        "a",
        "experiments_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final x:Lmf1/a$a;


# instance fields
.field private final w:Lhf1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmf1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmf1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmf1/a;->x:Lmf1/a$a;

    return-void
.end method

.method public constructor <init>(Lhf1/b;)V
    .locals 1

    const-string v0, "experimentsChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf1/a;->w:Lhf1/b;

    return-void
.end method

.method public static synthetic a(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lmf1/a;->c(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lmf1/a;)Lhf1/b;
    .locals 0

    iget-object p0, p0, Lmf1/a;->w:Lhf1/b;

    return-object p0
.end method

.method private static final c(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public intercept(Lud3/f0;)Lud3/x0;
    .locals 7

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmf1/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lmf1/a$b;-><init>(Lmf1/a;Lq83/d;)V

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Lmd0/b;

    const/4 v0, 0x7

    invoke-direct {v5, v0}, Lmd0/b;-><init>(I)V

    const/16 v6, 0x1e

    const-string v2, ", "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lae3/i;

    iget-object v1, p1, Lae3/i;->e:Lud3/o0;

    invoke-virtual {v1}, Lud3/o0;->b()Lud3/n0;

    move-result-object v1

    const-string v2, "X-WHOOP-Experiment-Properties"

    invoke-virtual {v1, v2, v0}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lud3/o0;

    invoke-direct {v0, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method
