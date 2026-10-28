.class public final synthetic Lce/r;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Lce/r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lce/r;

    const-string v4, "credentialProfile(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Section;"

    const/4 v5, 0x1

    const/4 v1, 0x3

    const-class v2, Lce/w;

    const-string v3, "credentialProfile"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lce/r;->w:Lce/r;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lce/m;

    check-cast p2, Lce/z;

    check-cast p3, Lce/y;

    const-string p2, "p0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p1, Lce/m;->b:Ljava/lang/String;

    invoke-static {p1}, Lbi/g;->K(Lce/m;)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {p1}, Lbi/g;->K(Lce/m;)Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    const-string p1, "sso-session"

    invoke-static {p2, p1, p3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "<this>"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, " #"

    invoke-static {p2, v0}, Lbp/b;->I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, " ;"

    invoke-static {p2, v0}, Lbp/b;->I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "#"

    invoke-static {p2, p1}, Lbp/b;->I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, ";"

    invoke-static {p1, p2}, Lbp/b;->I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2, p1}, Lyb3/r;->W(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lyb3/r;->X(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lce/z;

    sget-object v0, Lce/l;->w:Lce/l;

    invoke-static {p1}, Lbp/b;->B(Ljava/lang/String;)Z

    move-result v1

    invoke-direct {p2, p1, v0, p3, v1}, Lce/z;-><init>(Ljava/lang/String;Lce/l;ZZ)V

    return-object p2

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
