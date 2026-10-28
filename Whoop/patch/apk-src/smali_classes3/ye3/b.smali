.class public final Lye3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lye3/g;


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lye3/b;->a:Ljava/util/regex/Pattern;

    const-string v0, "^([a-zA-Z0-9.!#$%&\'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lye3/b;->b:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final a(Lxe3/k;)Lpg3/p;
    .locals 5

    iget-object p1, p1, Lxe3/k;->e:Lab/l0;

    invoke-virtual {p1}, Lab/l0;->i()V

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v0

    const/16 v1, 0x3e

    invoke-virtual {p1, v1}, Lab/l0;->b(C)I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_2

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v0

    invoke-virtual {v0}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lab/l0;->i()V

    sget-object v3, Lye3/b;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    sget-object v3, Lye3/b;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "mailto:"

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_2

    new-instance v4, Laf3/p;

    invoke-direct {v4, v3, v2}, Laf3/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Laf3/a0;

    invoke-direct {v2, v1}, Laf3/a0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Laa3/u0;->o()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v2, v0}, Laf3/t;->h(Ljava/util/List;)V

    invoke-virtual {v4, v2}, Laf3/t;->c(Laf3/t;)V

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object p1

    new-instance v0, Lpg3/p;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-direct {v0, v4, p1, v2, v1}, Lpg3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    return-object v0

    :cond_2
    return-object v2
.end method
