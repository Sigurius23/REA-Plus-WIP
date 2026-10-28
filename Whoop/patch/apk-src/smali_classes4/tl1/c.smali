.class public final Ltl1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltl1/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lil1/c;",
        "Ltl1/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Ltl1/c;",
        "Lod1/g;",
        "Lil1/c;",
        "Ltl1/a;",
        "Lu92/d;",
        "prefsStore",
        "Lcom/whoop/home/domain/HomeApi;",
        "homeApi",
        "Ltr2/n;",
        "logger",
        "Lgl1/b;",
        "homeAnalyticsHelper",
        "<init>",
        "(Lu92/d;Lcom/whoop/home/domain/HomeApi;Ltr2/n;Lgl1/b;)V",
        "",
        "featureId",
        "h",
        "(Ltl1/a;ILq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lu92/d;",
        "b",
        "Lcom/whoop/home/domain/HomeApi;",
        "c",
        "Ltr2/n;",
        "d",
        "Lgl1/b;",
        "e",
        "home_release"
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
.field public static final e:Ltl1/c$a;

.field public static final f:I

.field private static final g:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private static final h:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lu92/d;

.field private final b:Lcom/whoop/home/domain/HomeApi;

.field private final c:Ltr2/n;

.field private final d:Lgl1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltl1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltl1/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltl1/c;->e:Ltl1/c$a;

    const/16 v0, 0x8

    sput v0, Ltl1/c;->f:I

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    sput-object v0, Ltl1/c;->g:Lec3/p1;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    sput-object v0, Ltl1/c;->h:Lec3/f2;

    return-void
.end method

.method public constructor <init>(Lu92/d;Lcom/whoop/home/domain/HomeApi;Ltr2/n;Lgl1/b;)V
    .locals 1

    const-string v0, "prefsStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "homeApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "homeAnalyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl1/c;->a:Lu92/d;

    iput-object p2, p0, Ltl1/c;->b:Lcom/whoop/home/domain/HomeApi;

    iput-object p3, p0, Ltl1/c;->c:Ltr2/n;

    iput-object p4, p0, Ltl1/c;->d:Lgl1/b;

    return-void
.end method

.method public static final synthetic c()Lec3/f2;
    .locals 1

    sget-object v0, Ltl1/c;->h:Lec3/f2;

    return-object v0
.end method

.method public static final synthetic d(Ltl1/c;)Lcom/whoop/home/domain/HomeApi;
    .locals 0

    iget-object p0, p0, Ltl1/c;->b:Lcom/whoop/home/domain/HomeApi;

    return-object p0
.end method

.method public static final synthetic e(Ltl1/c;)Lu92/d;
    .locals 0

    iget-object p0, p0, Ltl1/c;->a:Lu92/d;

    return-object p0
.end method

.method public static final synthetic f()Lec3/p1;
    .locals 1

    sget-object v0, Ltl1/c;->g:Lec3/p1;

    return-object v0
.end method

.method public static final synthetic g(Ltl1/c;Ltl1/a;ILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ltl1/c;->h(Ltl1/a;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h(Ltl1/a;ILq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltl1/a;",
            "I",
            "Lq83/d<",
            "-",
            "Ltl1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Ltl1/c$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ltl1/c$c;

    iget v1, v0, Ltl1/c$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltl1/c$c;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ltl1/c$c;

    invoke-direct {v0, p0, p3}, Ltl1/c$c;-><init>(Ltl1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Ltl1/c$c;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ltl1/c$c;->E:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v10, :cond_1

    iget-object p1, v6, Ltl1/c$c;->w:Ljava/lang/Object;

    check-cast p1, Ltl1/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Ltl1/c;->a:Lu92/d;

    const-string v1, "HasSeenTransitionOverlay"

    invoke-virtual {p3, v1, v10}, Lu92/d;->q(Ljava/lang/String;Z)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Ltl1/c;->c:Ltr2/n;

    new-instance v5, Ltl1/c$d;

    invoke-direct {v5, p0, p2, v9}, Ltl1/c$d;-><init>(Ltl1/c;ILq83/d;)V

    iput-object p1, v6, Ltl1/c$c;->w:Ljava/lang/Object;

    iput p2, v6, Ltl1/c$c;->x:I

    iput v10, v6, Ltl1/c$c;->E:I

    const/4 v3, 0x0

    const-string v4, "Failed to POST transition overlay complete"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    iget-object p2, p0, Ltl1/c;->d:Lgl1/b;

    invoke-virtual {p2}, Lgl1/b;->K()V

    const/4 p2, 0x0

    invoke-static {p1, p2, v10, v10, v9}, Ltl1/a;->b(Ltl1/a;ZZILjava/lang/Object;)Ltl1/a;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltl1/a;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v1, v1, v2, v3}, Ltl1/a;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ltl1/c$b;

    invoke-direct {v1, p0, v3}, Ltl1/c$b;-><init>(Ltl1/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
