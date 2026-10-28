.class public final Lmg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmg/h;


# static fields
.field public static final b:Lmg/b;

.field public static final c:Lpg/e;

.field public static final d:Lrg/l;

.field public static final e:Lng/b;

.field public static final f:Lqg/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmg/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lmg/b;->b:Lmg/b;

    sget-object v0, Log/a;->a:Lpg/e;

    sput-object v0, Lmg/b;->c:Lpg/e;

    sget-object v0, Lrg/m;->a:Lrg/l;

    sput-object v0, Lmg/b;->d:Lrg/l;

    sget-object v0, Lng/c;->a:Lng/b;

    sput-object v0, Lmg/b;->e:Lng/b;

    sget-object v0, Lqg/f;->a:Lqg/d;

    sput-object v0, Lmg/b;->f:Lqg/d;

    return-void
.end method


# virtual methods
.method public final a()Lqg/g;
    .locals 1

    sget-object v0, Lmg/b;->f:Lqg/d;

    return-object v0
.end method

.method public final b()Lng/d;
    .locals 1

    sget-object v0, Lmg/b;->e:Lng/b;

    return-object v0
.end method

.method public final c()Log/j;
    .locals 1

    sget-object v0, Lmg/b;->c:Lpg/e;

    return-object v0
.end method

.method public final d()Lrg/n;
    .locals 1

    sget-object v0, Lmg/b;->d:Lrg/l;

    return-object v0
.end method
