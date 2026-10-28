.class public final Lb3/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb3/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb3/l0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb3/l0;->a:Lb3/l0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->clearViewTranslationCallback()V

    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    sget-object v0, Lb3/k0;->a:Lb3/k0;

    invoke-virtual {p1, v0}, Landroid/view/View;->setViewTranslationCallback(Landroid/view/translation/ViewTranslationCallback;)V

    return-void
.end method
