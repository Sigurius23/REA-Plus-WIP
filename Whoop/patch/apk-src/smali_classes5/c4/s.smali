.class public final Lc4/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc4/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc4/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc4/s;->a:Lc4/s;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    return-void
.end method
