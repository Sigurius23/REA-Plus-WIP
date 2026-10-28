.class public final Lin2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lin2/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0006\u001a\u0004\u0008\u0010\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Lin2/a;",
        "Lin2/d;",
        "<init>",
        "()V",
        "Lbc3/z;",
        "a",
        "Lbc3/z;",
        "c",
        "()Lbc3/z;",
        "Default",
        "Lbc3/w1;",
        "b",
        "Lbc3/w1;",
        "e",
        "()Lbc3/w1;",
        "Main",
        "d",
        "IO",
        "essentials_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# instance fields
.field private final a:Lbc3/z;

.field private final b:Lbc3/w1;

.field private final c:Lbc3/z;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    iput-object v0, p0, Lin2/a;->a:Lbc3/z;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    iput-object v0, p0, Lin2/a;->b:Lbc3/w1;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    iput-object v0, p0, Lin2/a;->c:Lbc3/z;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lq83/j;
    .locals 1

    invoke-virtual {p0}, Lin2/a;->e()Lbc3/w1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lq83/j;
    .locals 1

    invoke-virtual {p0}, Lin2/a;->d()Lbc3/z;

    move-result-object v0

    return-object v0
.end method

.method public c()Lbc3/z;
    .locals 1

    iget-object v0, p0, Lin2/a;->a:Lbc3/z;

    return-object v0
.end method

.method public d()Lbc3/z;
    .locals 1

    iget-object v0, p0, Lin2/a;->c:Lbc3/z;

    return-object v0
.end method

.method public e()Lbc3/w1;
    .locals 1

    iget-object v0, p0, Lin2/a;->b:Lbc3/w1;

    return-object v0
.end method

.method public bridge synthetic getDefault()Lq83/j;
    .locals 1

    invoke-virtual {p0}, Lin2/a;->c()Lbc3/z;

    move-result-object v0

    return-object v0
.end method
