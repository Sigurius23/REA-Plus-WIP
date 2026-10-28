.class public final synthetic Lce/n;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Lce/n;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lce/n;

    const-string v4, "configurationSection(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Section;"

    const/4 v5, 0x1

    const/4 v1, 0x3

    const-class v2, Lce/w;

    const-string v3, "configurationSection"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lce/n;->w:Lce/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Lce/m;

    check-cast p2, Lce/z;

    check-cast p3, Lce/y;

    const-string p2, "p0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lbi/g;->K(Lce/m;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p1, Lce/m;->b:Ljava/lang/String;

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, " #"

    invoke-static {p1, p3}, Lbp/b;->I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, " ;"

    invoke-static {p1, p3}, Lbp/b;->I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "#"

    invoke-static {p1, p2}, Lbp/b;->I(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string p3, " "

    const-string v0, "\t"

    filled-new-array {p3, v0}, [Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x2

    invoke-static {p1, p3, v0}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p3, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    const-string v1, "default"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    xor-int/lit8 v2, p3, 0x1

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    :sswitch_1
    const-string v5, "services"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    sget-object v4, Lce/l;->y:Lce/l;

    goto :goto_3

    :sswitch_2
    const-string v5, "profile"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    sget-object v4, Lce/l;->w:Lce/l;

    goto :goto_3

    :sswitch_3
    const-string v5, "sso-session"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :goto_2
    sget-object v4, Lce/l;->z:Lce/l;

    goto :goto_3

    :cond_6
    sget-object v4, Lce/l;->x:Lce/l;

    :goto_3
    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_7

    const-string v5, ""

    :cond_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v6, p2, :cond_8

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v0, :cond_9

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_9

    if-nez p3, :cond_9

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lbp/b;->B(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_4

    :cond_9
    move p2, v3

    :cond_a
    :goto_4
    new-instance p1, Lce/z;

    invoke-direct {p1, v5, v4, v2, p2}, Lce/z;-><init>(Ljava/lang/String;Lce/l;ZZ)V

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5db45b28 -> :sswitch_3
        -0x12717657 -> :sswitch_2
        0x5235105e -> :sswitch_1
        0x5c13d641 -> :sswitch_0
    .end sparse-switch
.end method
