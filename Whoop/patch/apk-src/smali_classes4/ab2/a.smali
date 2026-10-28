.class public final Lab2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lab2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J1\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ+\u0010\u000f\u001a\u00020\u000b2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\u000b2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u000b2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J+\u0010\u001a\u001a\u00020\u000b2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u001a\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lab2/a;",
        "",
        "Lz82/b;",
        "analyticsManager",
        "<init>",
        "(Lz82/b;)V",
        "",
        "eventAction",
        "eventLabel",
        "eventCategory",
        "eventValue",
        "Ll83/a0;",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "action",
        "f",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "index",
        "a",
        "(ILjava/lang/String;Ljava/lang/String;)V",
        "e",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "g",
        "actionSuffix",
        "b",
        "Lz82/b;",
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


# static fields
.field public static final b:Lab2/a$a;

.field public static final c:I


# instance fields
.field private final a:Lz82/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lab2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lab2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lab2/a;->b:Lab2/a$a;

    const/16 v0, 0x8

    sput v0, Lab2/a;->c:I

    return-void
.end method

.method public constructor <init>(Lz82/b;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab2/a;->a:Lz82/b;

    return-void
.end method

.method private final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lab2/a;->a:Lz82/b;

    const-string v4, "In App Banners"

    move-object v2, p1

    move-object v3, p2

    move-object v1, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lab2/a;->a:Lz82/b;

    const-string v3, "1"

    const-string v4, "In App Banners"

    move-object v1, p1

    move-object v5, p2

    move-object v2, p3

    invoke-interface/range {v0 .. v5}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "eventCategory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Click"

    invoke-direct {p0, v0, p1, p2, p3}, Lab2/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p3, :cond_0

    const-string v0, " "

    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_1

    :cond_0
    const-string p3, ""

    :cond_1
    const-string v0, "Click"

    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lab2/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "Dismiss"

    invoke-direct {p0, p1, p2, v0}, Lab2/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final e(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "eventCategory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Swipe"

    invoke-direct {p0, v0, p1, p2, p3}, Lab2/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "Swipe"

    invoke-direct {p0, p1, p2, v0}, Lab2/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
