.class final Lid2/n$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lid2/n;->t(Landroid/content/Context;Lid2/j;Lkd1/m;Ly3/c;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final w:Lid2/n$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lid2/n$d;

    invoke-direct {v0}, Lid2/n$d;-><init>()V

    sput-object v0, Lid2/n$d;->w:Lid2/n$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lid2/n$d;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
