.class public final Lfn2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfn2/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lfn2/k;",
        "",
        "Lfn2/g;",
        "orientationHelper",
        "<init>",
        "(Lfn2/g;)V",
        "",
        "orientationDegrees",
        "Lfn2/j;",
        "a",
        "(I)Lfn2/j;",
        "Lfn2/g;",
        "b",
        "Lfn2/j;",
        "previousOrientation",
        "c",
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
.field private static final c:Lfn2/k$a;


# instance fields
.field private final a:Lfn2/g;

.field private b:Lfn2/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfn2/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfn2/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfn2/k;->c:Lfn2/k$a;

    return-void
.end method

.method public constructor <init>(Lfn2/g;)V
    .locals 1

    const-string v0, "orientationHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn2/k;->a:Lfn2/g;

    return-void
.end method


# virtual methods
.method public final a(I)Lfn2/j;
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lfn2/k;->a:Lfn2/g;

    invoke-virtual {v0, p1}, Lfn2/g;->a(I)I

    move-result p1

    invoke-static {p1}, Lfn2/m;->a(I)Lfn2/j;

    move-result-object p1

    iget-object v0, p0, Lfn2/k;->b:Lfn2/j;

    if-nez v0, :cond_1

    iput-object p1, p0, Lfn2/k;->b:Lfn2/j;

    return-object v1

    :cond_1
    if-ne p1, v0, :cond_2

    return-object v1

    :cond_2
    iput-object p1, p0, Lfn2/k;->b:Lfn2/j;

    return-object p1
.end method
