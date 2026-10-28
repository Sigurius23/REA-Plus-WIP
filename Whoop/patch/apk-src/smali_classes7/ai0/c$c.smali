.class public final Lai0/c$c;
.super Lai0/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lai0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000c\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\r\u001a\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lai0/c$c;",
        "Lai0/c;",
        "Lc51/s;",
        "amoeba",
        "",
        "paceOfAgingSliderProgress",
        "yearsDifferenceSliderProgress",
        "<init>",
        "(Lc51/s;FF)V",
        "a",
        "Lc51/s;",
        "()Lc51/s;",
        "b",
        "F",
        "()F",
        "c",
        "amoeba_release"
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
.field public static final d:I


# instance fields
.field private final a:Lc51/s;

.field private final b:F

.field private final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lc51/s;->p:I

    sput v0, Lai0/c$c;->d:I

    return-void
.end method

.method public constructor <init>(Lc51/s;FF)V
    .locals 1

    const-string v0, "amoeba"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lai0/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lai0/c$c;->a:Lc51/s;

    iput p2, p0, Lai0/c$c;->b:F

    iput p3, p0, Lai0/c$c;->c:F

    return-void
.end method


# virtual methods
.method public final a()Lc51/s;
    .locals 1

    iget-object v0, p0, Lai0/c$c;->a:Lc51/s;

    return-object v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lai0/c$c;->b:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lai0/c$c;->c:F

    return v0
.end method
