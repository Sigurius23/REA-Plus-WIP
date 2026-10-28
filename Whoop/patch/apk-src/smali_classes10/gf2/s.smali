.class public abstract Lgf2/s;
.super Landroidx/databinding/a0;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/RadioButton;

.field public final b:Landroid/widget/RadioButton;

.field public final c:Landroid/widget/RadioButton;

.field public final d:Landroid/widget/RadioButton;

.field public final e:Landroid/widget/RadioButton;

.field public final f:Landroid/widget/RadioButton;

.field public final g:Landroid/widget/RadioButton;

.field public final h:Landroid/widget/RadioGroup;

.field protected i:I

.field protected j:I

.field protected k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioGroup;)V
    .locals 0

    invoke-direct {p0, p2, p3, p1}, Landroidx/databinding/a0;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    iput-object p4, p0, Lgf2/s;->a:Landroid/widget/RadioButton;

    iput-object p5, p0, Lgf2/s;->b:Landroid/widget/RadioButton;

    iput-object p6, p0, Lgf2/s;->c:Landroid/widget/RadioButton;

    iput-object p7, p0, Lgf2/s;->d:Landroid/widget/RadioButton;

    iput-object p8, p0, Lgf2/s;->e:Landroid/widget/RadioButton;

    iput-object p9, p0, Lgf2/s;->f:Landroid/widget/RadioButton;

    iput-object p10, p0, Lgf2/s;->g:Landroid/widget/RadioButton;

    iput-object p11, p0, Lgf2/s;->h:Landroid/widget/RadioGroup;

    return-void
.end method

.method public static c(Landroid/view/View;)Lgf2/s;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lgf2/s;->d(Landroid/view/View;Ljava/lang/Object;)Lgf2/s;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/View;Ljava/lang/Object;)Lgf2/s;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Lqe2/f;->r:I

    invoke-static {p1, p0, v0}, Landroidx/databinding/a0;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/a0;

    move-result-object p0

    check-cast p0, Lgf2/s;

    return-object p0
.end method


# virtual methods
.method public e()I
    .locals 1

    iget v0, p0, Lgf2/s;->i:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lgf2/s;->j:I

    return v0
.end method

.method public abstract g(I)V
.end method

.method public abstract h(Ljava/lang/String;)V
.end method

.method public abstract i(I)V
.end method
