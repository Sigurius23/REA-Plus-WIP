.class public final Lb3/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb3/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb3/i1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb3/i1;->a:Lb3/i1;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Z
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->isShowingLayoutBounds()Z

    move-result p1

    return p1
.end method
