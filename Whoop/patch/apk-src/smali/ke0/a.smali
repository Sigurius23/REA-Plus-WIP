.class public final Lke0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J!\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lke0/a;",
        "",
        "Ljb1/a;",
        "designSystemReducer",
        "Lnd0/a;",
        "schedulingButtonStateFactory",
        "<init>",
        "(Ljb1/a;Lnd0/a;)V",
        "Lec3/l;",
        "Lhe0/b;",
        "upstream",
        "Lje0/c;",
        "c",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ljb1/a;",
        "b",
        "Lnd0/a;",
        "advanced-labs_release"
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
.field public static final c:I


# instance fields
.field private final a:Ljb1/a;

.field private final b:Lnd0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lke0/a;->c:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;Lnd0/a;)V
    .locals 1

    const-string v0, "designSystemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulingButtonStateFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lke0/a;->a:Ljb1/a;

    .line 3
    iput-object p2, p0, Lke0/a;->b:Lnd0/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;Lnd0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 4
    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object p1

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lke0/a;-><init>(Ljb1/a;Lnd0/a;)V

    return-void
.end method

.method public static final synthetic a(Lke0/a;)Ljb1/a;
    .locals 0

    iget-object p0, p0, Lke0/a;->a:Ljb1/a;

    return-object p0
.end method

.method public static final synthetic b(Lke0/a;)Lnd0/a;
    .locals 0

    iget-object p0, p0, Lke0/a;->b:Lnd0/a;

    return-object p0
.end method


# virtual methods
.method public final c(Lec3/l;)Lec3/l;
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

    new-instance v0, Lke0/a$a;

    invoke-direct {v0, p1, p0}, Lke0/a$a;-><init>(Lec3/l;Lke0/a;)V

    return-object v0
.end method
