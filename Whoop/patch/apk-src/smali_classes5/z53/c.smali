.class public final Lz53/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lz53/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz53/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lz53/c;->w:Lz53/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lud3/k0;

    invoke-direct {v0}, Lud3/k0;-><init>()V

    new-instance v1, Lud3/l0;

    invoke-direct {v1, v0}, Lud3/l0;-><init>(Lud3/k0;)V

    return-object v1
.end method
