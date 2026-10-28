.class public final Lc2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc2/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lc2/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc2/i;->a:Lc2/f;

    return-void
.end method

.method public static a(Landroid/view/ViewStructure;)I
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/ViewStructure;->addChildCount(I)I

    move-result p0

    return p0
.end method

.method public static b(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;
    .locals 0

    invoke-static {p0}, Landroid/view/autofill/AutofillValue;->forText(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/view/autofill/AutofillValue;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/autofill/AutofillValue;->isDate()Z

    move-result p0

    return p0
.end method

.method public static d(Landroid/view/autofill/AutofillValue;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/autofill/AutofillValue;->isList()Z

    move-result p0

    return p0
.end method

.method public static e(Landroid/view/autofill/AutofillValue;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/autofill/AutofillValue;->isText()Z

    move-result p0

    return p0
.end method

.method public static f(Landroid/view/autofill/AutofillValue;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/autofill/AutofillValue;->isToggle()Z

    move-result p0

    return p0
.end method

.method public static g(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p0}, Landroid/view/autofill/AutofillValue;->getTextValue()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method
