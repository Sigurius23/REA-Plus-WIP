.class public final Li20/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# static fields
.field public static final w:Li20/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li20/w0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li20/w0;->w:Li20/w0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lc93/a;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    const-string v0, "onBack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    const/16 v1, 0x20

    if-nez p4, :cond_3

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    move p4, v1

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x93

    const/16 v2, 0x92

    if-ne p4, v2, :cond_5

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p4}, Lp1/q;->X()V

    goto :goto_5

    :cond_5
    :goto_3
    check-cast p3, Lp1/q;

    const p4, -0x257d0f08

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    and-int/lit8 p4, v0, 0x70

    const/4 v2, 0x0

    if-ne p4, v1, :cond_6

    const/4 p4, 0x1

    goto :goto_4

    :cond_6
    move p4, v2

    :goto_4
    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_7

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne v1, p4, :cond_8

    :cond_7
    new-instance v1, Lg40/i3;

    const/16 p4, 0x14

    invoke-direct {v1, p2, p4}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {p3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v1, Lc93/a;

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    and-int/lit8 p2, v0, 0xe

    invoke-static {p1, v1, p3, p2}, Lse/b;->a(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
