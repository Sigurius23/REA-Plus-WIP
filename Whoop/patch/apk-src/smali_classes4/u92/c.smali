.class public final Lu92/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu92/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0008\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0010B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R#\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00130\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lu92/c;",
        "",
        "La6/g;",
        "Lf6/f;",
        "prefsDataStore",
        "<init>",
        "(La6/g;)V",
        "",
        "userId",
        "offerId",
        "Ll83/a0;",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;)Z",
        "a",
        "La6/g;",
        "Lec3/l;",
        "",
        "b",
        "Lec3/l;",
        "d",
        "()Lec3/l;",
        "dismissedUserOfferIdsFlow",
        "core_release"
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
.field public static final c:Lu92/c$a;

.field private static final d:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# instance fields
.field private final a:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final b:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu92/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu92/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lu92/c;->c:Lu92/c$a;

    const-string v0, "dismissed_lto_offer_ids"

    invoke-static {v0}, Lge3/g;->V(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lu92/c;->d:Lf6/d;

    return-void
.end method

.method public constructor <init>(La6/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            ")V"
        }
    .end annotation

    const-string v0, "prefsDataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu92/c;->a:La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    new-instance v0, Lu92/c$d;

    invoke-direct {v0, p1}, Lu92/c$d;-><init>(Lec3/l;)V

    iput-object v0, p0, Lu92/c;->b:Lec3/l;

    return-void
.end method

.method public static final synthetic a()Lf6/d;
    .locals 1

    sget-object v0, Lu92/c;->d:Lf6/d;

    return-object v0
.end method

.method public static final synthetic b(Lu92/c;)La6/g;
    .locals 0

    iget-object p0, p0, Lu92/c;->a:La6/g;

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lu92/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lu92/c$b;-><init>(Lu92/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0}, Lbc3/f0;->F(Lc93/m;)Ljava/lang/Object;

    return-void
.end method

.method public final d()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lu92/c;->b:Lec3/l;

    return-object v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lu92/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lu92/c$c;-><init>(Lu92/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    sget-object p1, Lq83/k;->w:Lq83/k;

    invoke-static {p1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
