.class public final Lg9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg9/b;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lg9/b;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ls7/a;)Lg9/a;
    .locals 2

    new-instance v0, Lce3/a0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lce3/a0;-><init>(I)V

    new-instance v1, Lg9/k;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    invoke-direct {v1, p0, v0}, Lg9/k;-><init>(Ljava/lang/String;Lce3/a0;)V

    throw p0
.end method

.method public static c(IIIZ)Lg9/b;
    .locals 1

    new-instance v0, Lg9/b;

    invoke-static {p0, p1, p3, p2}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Lg9/b;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    return-object v0
.end method


# virtual methods
.method public b(Lu8/x;)Lg9/h;
    .locals 1

    iget-object v0, p1, Lu8/x;->b:Lu8/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lu8/x;->b:Lu8/u;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lg9/h;->a:Lg9/f;

    return-object p1
.end method
