.class public final Liz/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final a:Ls40/a1;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroidx/appcompat/widget/AppCompatImageView;


# direct methods
.method public constructor <init>(Ls40/a1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liz/e;->a:Ls40/a1;

    iput-object p2, p0, Liz/e;->b:Landroid/widget/TextView;

    iput-object p3, p0, Liz/e;->c:Landroid/widget/TextView;

    iput-object p4, p0, Liz/e;->d:Landroid/widget/TextView;

    iput-object p5, p0, Liz/e;->e:Landroidx/appcompat/widget/AppCompatImageView;

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Liz/e;->a:Ls40/a1;

    return-object v0
.end method
