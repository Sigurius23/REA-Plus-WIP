.class public final synthetic Lcom/whoop/whooplive/selfie/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method public synthetic constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/c;->w:Landroidx/viewpager/widget/ViewPager;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/c;->w:Landroidx/viewpager/widget/ViewPager;

    invoke-static {v0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity$c;->a(Landroidx/viewpager/widget/ViewPager;Landroid/view/View;)V

    return-void
.end method
