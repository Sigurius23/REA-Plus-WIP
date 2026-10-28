.class public final Lo52/a0;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo52/a0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "Lo52/a0;",
        "Lhj0/m;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "",
        "w",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lm52/i;",
        "<set-?>",
        "x",
        "Lcom/whoop/ui/b;",
        "E",
        "()Lm52/i;",
        "F",
        "(Lm52/i;)V",
        "binding",
        "y",
        "a",
        "realtime-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final E:I

.field public static final y:Lo52/a0$a;

.field static final synthetic z:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field


# instance fields
.field private final w:Ljava/lang/String;

.field private final x:Lcom/whoop/ui/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lo52/a0;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/realtime/databinding/FragmentRealtimeSleepBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lo52/a0;->z:[Lj93/z;

    new-instance v0, Lo52/a0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo52/a0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo52/a0;->y:Lo52/a0$a;

    sget v0, Lhj0/m;->$stable:I

    sget v1, Lcom/whoop/ui/b;->z:I

    or-int/2addr v0, v1

    sput v0, Lo52/a0;->E:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lhj0/m;-><init>()V

    const-string v0, "RealTimeSleepFragment"

    iput-object v0, p0, Lo52/a0;->w:Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lo52/a0;->x:Lcom/whoop/ui/b;

    return-void
.end method

.method private final E()Lm52/i;
    .locals 3

    iget-object v0, p0, Lo52/a0;->x:Lcom/whoop/ui/b;

    sget-object v1, Lo52/a0;->z:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm52/i;

    return-object v0
.end method

.method private final F(Lm52/i;)V
    .locals 3

    iget-object v0, p0, Lo52/a0;->x:Lcom/whoop/ui/b;

    sget-object v1, Lo52/a0;->z:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo52/a0;->w:Ljava/lang/String;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lm52/i;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lm52/i;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lo52/a0;->F(Lm52/i;)V

    invoke-direct {p0}, Lo52/a0;->E()Lm52/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lhj0/m;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p2, "ForSleep"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lo52/a0;->E()Lm52/i;

    move-result-object p1

    iget-object p1, p1, Lm52/i;->a:Landroid/widget/ImageView;

    sget p2, Lk52/c;->k:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lo52/a0;->E()Lm52/i;

    move-result-object p1

    iget-object p1, p1, Lm52/i;->b:Landroid/widget/TextView;

    sget p2, Lk52/f;->q:I

    invoke-virtual {p0, p2}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string p2, "ForNap"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lo52/a0;->E()Lm52/i;

    move-result-object p1

    iget-object p1, p1, Lm52/i;->a:Landroid/widget/ImageView;

    sget p2, Lk52/c;->k:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lo52/a0;->E()Lm52/i;

    move-result-object p1

    iget-object p1, p1, Lm52/i;->b:Landroid/widget/TextView;

    sget p2, Lk52/f;->p:I

    invoke-virtual {p0, p2}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
