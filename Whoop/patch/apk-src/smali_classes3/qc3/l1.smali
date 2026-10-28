.class public abstract Lqc3/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lqc3/w;

.field public static final b:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqc3/w;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lqc3/w;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    sput-object v0, Lqc3/l1;->a:Lqc3/w;

    new-instance v0, Lqa1/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lqa1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lqc3/l1;->b:Ll83/p;

    return-void
.end method

.method public static final a(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lkotlinx/datetime/DateTimeFormatException;

    const-string v0, " from the given input: the field "

    const-string v1, " is missing"

    const-string v2, "Can not create a "

    invoke-static {v2, p1, v0, p1, v1}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lkotlinx/datetime/DateTimeFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
