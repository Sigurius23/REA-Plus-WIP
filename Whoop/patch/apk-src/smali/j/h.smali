.class public final Lj/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lj/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lj/h;->w:Lj/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    const/high16 v0, 0x7fff0000

    sget-object v1, Lg93/d;->x:Lg93/a;

    invoke-virtual {v1, v0}, Lg93/a;->g(I)I

    move-result v0

    const/high16 v1, 0x10000

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
