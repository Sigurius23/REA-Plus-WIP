.class public final Lb3/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb3/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb3/n0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb3/n0;->a:Lb3/n0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;IZ)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(I)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setDefaultFocusHighlightEnabled(Z)V

    return-void
.end method
