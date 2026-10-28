.class public final Lz40/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lz40/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz40/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lz40/h;->w:Lz40/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    const-class v0, Lz40/b;

    const-class v1, Lz40/c;

    const-class v2, Lz40/a;

    const-class v3, Lz40/d;

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
