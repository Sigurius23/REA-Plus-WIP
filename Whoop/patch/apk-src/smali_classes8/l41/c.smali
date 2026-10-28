.class public final synthetic Ll41/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TimePicker$OnTimeChangedListener;


# instance fields
.field public final synthetic a:Lp1/c1;

.field public final synthetic b:Lp1/c1;

.field public final synthetic c:Z

.field public final synthetic d:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lp1/c1;Lp1/c1;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll41/c;->a:Lp1/c1;

    iput-object p3, p0, Ll41/c;->b:Lp1/c1;

    iput-boolean p4, p0, Ll41/c;->c:Z

    iput-object p1, p0, Ll41/c;->d:Lc93/m;

    return-void
.end method


# virtual methods
.method public final onTimeChanged(Landroid/widget/TimePicker;II)V
    .locals 7

    iget-boolean v2, p0, Ll41/c;->c:Z

    iget-object v3, p0, Ll41/c;->d:Lc93/m;

    iget-object v0, p0, Ll41/c;->a:Lp1/c1;

    iget-object v1, p0, Ll41/c;->b:Lp1/c1;

    move-object v4, p1

    move v5, p2

    move v6, p3

    invoke-static/range {v0 .. v6}, Ll41/d;->f(Lp1/c1;Lp1/c1;ZLc93/m;Landroid/widget/TimePicker;II)V

    return-void
.end method
