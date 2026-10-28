.class public final Lri1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lri1/l;",
        "Lri1/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lri1/o;",
        "Lod1/g;",
        "Lri1/l;",
        "Lri1/n;",
        "Lu92/d;",
        "sharedPreferences",
        "<init>",
        "(Lu92/d;)V",
        "Lri1/p;",
        "e",
        "()Lri1/p;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lu92/d;",
        "health_release"
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
.field private final a:Lu92/d;


# direct methods
.method public constructor <init>(Lu92/d;)V
    .locals 1

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lri1/o;->a:Lu92/d;

    return-void
.end method

.method public static final synthetic c(Lri1/o;)Lri1/p;
    .locals 0

    invoke-direct {p0}, Lri1/o;->e()Lri1/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lri1/o;)Lu92/d;
    .locals 0

    iget-object p0, p0, Lri1/o;->a:Lu92/d;

    return-object p0
.end method

.method private final e()Lri1/p;
    .locals 3

    iget-object v0, p0, Lri1/o;->a:Lu92/d;

    const-string v1, "TortoiseHasClosedCalibration"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lu92/d;->q(Ljava/lang/String;Z)V

    sget-object v0, Lri1/p$a;->a:Lri1/p$a;

    return-object v0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 8
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

    new-instance v0, Lri1/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lri1/o$a;-><init>(Lq83/d;Lri1/o;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lri1/n;

    sget-object v3, Lri1/m$a;->a:Lri1/m$a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lri1/n;-><init>(Lri1/m;Lcj1/m;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lri1/o$d;

    invoke-direct {v0, p0, v1}, Lri1/o$d;-><init>(Lri1/o;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
