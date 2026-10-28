.class public final Lye3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lye3/g;


# static fields
.field public static final a:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^[!\"#$%&\'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lye3/c;->a:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final a(Lxe3/k;)Lpg3/p;
    .locals 4

    iget-object p1, p1, Lxe3/k;->e:Lab/l0;

    invoke-virtual {p1}, Lab/l0;->i()V

    invoke-virtual {p1}, Lab/l0;->l()C

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lab/l0;->i()V

    new-instance v0, Laf3/j;

    invoke-direct {v0}, Laf3/t;-><init>()V

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object p1

    new-instance v1, Lpg3/p;

    const/16 v2, 0xf

    const/4 v3, 0x0

    invoke-direct {v1, v0, p1, v3, v2}, Lpg3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    return-object v1

    :cond_0
    sget-object v1, Lye3/c;->a:Ljava/util/regex/Pattern;

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lab/l0;->i()V

    new-instance v1, Laf3/a0;

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Laf3/a0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object p1

    new-instance v0, Lpg3/p;

    const/16 v2, 0xf

    const/4 v3, 0x0

    invoke-direct {v0, v1, p1, v3, v2}, Lpg3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    return-object v0

    :cond_1
    new-instance v0, Laf3/a0;

    const-string v1, "\\"

    invoke-direct {v0, v1}, Laf3/a0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object p1

    new-instance v1, Lpg3/p;

    const/16 v2, 0xf

    const/4 v3, 0x0

    invoke-direct {v1, v0, p1, v3, v2}, Lpg3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    return-object v1
.end method
