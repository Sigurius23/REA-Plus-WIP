.class public final Lpc2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lpc2/a;",
        "Lpc2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpc2/c;",
        "Lod1/g;",
        "Lpc2/a;",
        "Lpc2/b;",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lq92/h;",
        "whoopStrapSharedPrefs",
        "<init>",
        "(Lci2/b;Lq92/h;)V",
        "Lst0/v;",
        "d",
        "()Lst0/v;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lci2/b;",
        "getWhoopStrapProvider",
        "()Lci2/b;",
        "b",
        "Lq92/h;",
        "getWhoopStrapSharedPrefs",
        "()Lq92/h;",
        "settings_release"
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
.field private final a:Lci2/b;

.field private final b:Lq92/h;


# direct methods
.method public constructor <init>(Lci2/b;Lq92/h;)V
    .locals 1

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapSharedPrefs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc2/c;->a:Lci2/b;

    iput-object p2, p0, Lpc2/c;->b:Lq92/h;

    return-void
.end method

.method public static final synthetic c(Lpc2/c;)Lst0/v;
    .locals 0

    invoke-direct {p0}, Lpc2/c;->d()Lst0/v;

    move-result-object p0

    return-object p0
.end method

.method private final d()Lst0/v;
    .locals 3

    iget-object v0, p0, Lpc2/c;->a:Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljk0/d;->w0()Lst0/v;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lpc2/c;->b:Lq92/h;

    invoke-virtual {v0}, Lq92/h;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x21cf04

    if-eq v1, v2, :cond_6

    const v2, 0x41ca8f9

    if-eq v1, v2, :cond_4

    const v2, 0x19177ac2

    if-eq v1, v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "Maverick"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    sget-object v0, Lst0/v;->MAVERICK:Lst0/v;

    return-object v0

    :cond_4
    const-string v1, "Goose"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    sget-object v0, Lst0/v;->GOOSE:Lst0/v;

    return-object v0

    :cond_6
    const-string v1, "Gen4"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :goto_1
    sget-object v0, Lst0/v;->GEN_4:Lst0/v;

    return-object v0

    :cond_7
    sget-object v0, Lst0/v;->GEN_4:Lst0/v;

    return-object v0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 1
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

    new-instance v0, Lpc2/c$a;

    invoke-direct {v0, p1, p0}, Lpc2/c$a;-><init>(Lec3/l;Lpc2/c;)V

    return-object v0
.end method
