.class public final enum Lce/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lce/v;

.field public static final synthetic F:[Lce/v;

.field public static final enum z:Lce/v;


# instance fields
.field public final w:Ljf/a;

.field public final x:Ljava/util/List;

.field public final y:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lce/v;

    sget-object v3, Lyd/f;->g:Ljf/a;

    const/4 v6, 0x4

    new-array v1, v6, [Lj93/g;

    sget-object v2, Lce/n;->w:Lce/n;

    const/4 v7, 0x0

    aput-object v2, v1, v7

    sget-object v2, Lce/o;->w:Lce/o;

    const/4 v8, 0x1

    aput-object v2, v1, v8

    sget-object v2, Lce/p;->w:Lce/p;

    const/4 v9, 0x2

    aput-object v2, v1, v9

    sget-object v2, Lce/q;->w:Lce/q;

    const/4 v10, 0x3

    aput-object v2, v1, v10

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v1, "config"

    const-string v11, "~"

    const-string v12, ".aws"

    filled-new-array {v11, v12, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v1, "CONFIGURATION"

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lce/v;-><init>(Ljava/lang/String;ILjf/a;Ljava/util/List;Ljava/util/List;)V

    sput-object v0, Lce/v;->z:Lce/v;

    new-instance v13, Lce/v;

    sget-object v16, Lyd/f;->h:Ljf/a;

    new-array v1, v6, [Lj93/g;

    sget-object v2, Lce/r;->w:Lce/r;

    aput-object v2, v1, v7

    sget-object v2, Lce/s;->w:Lce/s;

    aput-object v2, v1, v8

    sget-object v2, Lce/t;->w:Lce/t;

    aput-object v2, v1, v9

    sget-object v2, Lce/u;->w:Lce/u;

    aput-object v2, v1, v10

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const-string v1, "credentials"

    filled-new-array {v11, v12, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const-string v14, "CREDENTIAL"

    const/4 v15, 0x1

    invoke-direct/range {v13 .. v18}, Lce/v;-><init>(Ljava/lang/String;ILjf/a;Ljava/util/List;Ljava/util/List;)V

    sput-object v13, Lce/v;->E:Lce/v;

    filled-new-array {v0, v13}, [Lce/v;

    move-result-object v0

    sput-object v0, Lce/v;->F:[Lce/v;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjf/a;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lce/v;->w:Ljf/a;

    iput-object p4, p0, Lce/v;->x:Ljava/util/List;

    iput-object p5, p0, Lce/v;->y:Ljava/util/List;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lce/v;
    .locals 1

    const-class v0, Lce/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lce/v;

    return-object p0
.end method

.method public static values()[Lce/v;
    .locals 1

    sget-object v0, Lce/v;->F:[Lce/v;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lce/v;

    return-object v0
.end method


# virtual methods
.method public final a(Lvg/n;)Ljava/lang/String;
    .locals 6

    const-string v0, "platform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lce/v;->w:Ljf/a;

    invoke-static {v0, p1}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lce/v;->y:Ljava/util/List;

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    sget-object p1, Lvg/r;->d:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "getValue(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
