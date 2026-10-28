.class public final Lz41/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ&\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008 \u0010\u0014\"\u0004\u0008\"\u0010#R\u0016\u0010\'\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010&R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00070(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001d\u00a8\u0006*"
    }
    d2 = {
        "Lz41/e;",
        "",
        "Lz41/g;",
        "particleSystemSettings",
        "",
        "createdAt",
        "",
        "La51/h;",
        "initialParticles",
        "",
        "pixelDensity",
        "<init>",
        "(Lz41/g;JLjava/util/List;F)V",
        "deltaTime",
        "Lb51/a;",
        "drawArea",
        "g",
        "(FLb51/a;Lq83/d;)Ljava/lang/Object;",
        "",
        "f",
        "()Z",
        "a",
        "Lz41/g;",
        "e",
        "()Lz41/g;",
        "b",
        "J",
        "c",
        "()J",
        "Ljava/util/List;",
        "getInitialParticles",
        "()Ljava/util/List;",
        "d",
        "Z",
        "setEnabled",
        "(Z)V",
        "enabled",
        "La51/b;",
        "La51/b;",
        "emitter",
        "",
        "activeParticles",
        "design_release"
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
.field private final a:Lz41/g;

.field private final b:J

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La51/h;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:La51/b;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La51/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz41/g;JLjava/util/List;F)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz41/g;",
            "J",
            "Ljava/util/List<",
            "La51/h;",
            ">;F)V"
        }
    .end annotation

    const-string v0, "particleSystemSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialParticles"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz41/e;->a:Lz41/g;

    .line 3
    iput-wide p2, p0, Lz41/e;->b:J

    .line 4
    iput-object p4, p0, Lz41/e;->c:Ljava/util/List;

    const/4 p2, 0x1

    .line 5
    iput-boolean p2, p0, Lz41/e;->d:Z

    .line 6
    new-instance v0, La51/a;

    invoke-virtual {p1}, Lz41/g;->g()La51/f;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move v2, p5

    invoke-direct/range {v0 .. v5}, La51/a;-><init>(La51/f;FLg93/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lz41/e;->e:La51/b;

    .line 7
    check-cast p4, Ljava/util/Collection;

    invoke-static {p4}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lz41/e;->f:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lz41/g;JLjava/util/List;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 9
    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    .line 10
    invoke-direct/range {v0 .. v5}, Lz41/e;-><init>(Lz41/g;JLjava/util/List;F)V

    return-void
.end method

.method public static final synthetic a(Lz41/e;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lz41/e;->f:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic b(Lz41/e;)La51/b;
    .locals 0

    iget-object p0, p0, Lz41/e;->e:La51/b;

    return-object p0
.end method


# virtual methods
.method public final c()J
    .locals 2

    iget-wide v0, p0, Lz41/e;->b:J

    return-wide v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lz41/e;->d:Z

    return v0
.end method

.method public final e()Lz41/g;
    .locals 1

    iget-object v0, p0, Lz41/e;->a:Lz41/g;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lz41/e;->e:La51/b;

    invoke-virtual {v0}, La51/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz41/e;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lz41/e;->d:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lz41/e;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final g(FLb51/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lb51/a;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "La51/h;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lz41/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lz41/e$a;-><init>(Lz41/e;FLb51/a;Lq83/d;)V

    invoke-static {v0, p3}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
