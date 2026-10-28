.class public final Liz/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final a:Lcom/stripe/android/view/MaskedCardView;

.field public final b:Landroidx/appcompat/widget/AppCompatImageView;

.field public final c:Landroidx/appcompat/widget/AppCompatImageView;

.field public final d:Landroidx/appcompat/widget/AppCompatTextView;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/MaskedCardView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatTextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liz/c;->a:Lcom/stripe/android/view/MaskedCardView;

    iput-object p2, p0, Liz/c;->b:Landroidx/appcompat/widget/AppCompatImageView;

    iput-object p3, p0, Liz/c;->c:Landroidx/appcompat/widget/AppCompatImageView;

    iput-object p4, p0, Liz/c;->d:Landroidx/appcompat/widget/AppCompatTextView;

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Liz/c;->a:Lcom/stripe/android/view/MaskedCardView;

    return-object v0
.end method
