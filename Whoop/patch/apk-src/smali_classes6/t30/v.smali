.class public final Lt30/v;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final E:Ljava/util/regex/Pattern;

.field public static final z:Ljava/util/regex/Pattern;


# instance fields
.field public final w:Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;

.field public x:Ljava/lang/String;

.field public y:Landroid/view/View$OnClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "method=\"post\""

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lt30/v;->z:Ljava/util/regex/Pattern;

    const-string v0, "action=\"(.+?)\""

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lt30/v;->E:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/r0;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string v0, ""

    iput-object v0, p0, Lt30/v;->x:Ljava/lang/String;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d0651

    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f0a0d85

    invoke-static {p0, p1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;

    if-eqz v0, :cond_0

    iput-object v0, p0, Lt30/v;->w:Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;

    new-instance p1, Lrm/p;

    const/16 v1, 0xd

    invoke-direct {p1, p0, v1}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;->setOnHtmlSubmitListener$3ds2sdk_release(Lt30/z;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lt30/v;->z:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    const-string v0, "method=\"get\""

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "replaceAll(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lt30/v;->E:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "https://emv3ds/challenge"

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v3, "compile(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v3, p1

    const-string v5, "UTF-8"

    const/4 v6, 0x0

    iget-object v1, p0, Lt30/v;->w:Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;

    const/4 v2, 0x0

    const-string v4, "text/html"

    invoke-virtual/range {v1 .. v6}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final getOnClickListener$3ds2sdk_release()Landroid/view/View$OnClickListener;
    .locals 1

    iget-object v0, p0, Lt30/v;->y:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public getUserEntry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt30/v;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebView()Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;
    .locals 1

    iget-object v0, p0, Lt30/v;->w:Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;

    return-object v0
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lt30/v;->y:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final setOnClickListener$3ds2sdk_release(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lt30/v;->y:Landroid/view/View$OnClickListener;

    return-void
.end method
