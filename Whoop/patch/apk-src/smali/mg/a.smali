.class public abstract Lmg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmg/h;


# instance fields
.field private final b:Lqg/g;

.field private final c:Lrg/n;

.field private final d:Log/j;

.field private final e:Lng/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lqg/f;->a:Lqg/d;

    iput-object v0, p0, Lmg/a;->b:Lqg/g;

    sget-object v0, Lrg/m;->a:Lrg/l;

    iput-object v0, p0, Lmg/a;->c:Lrg/n;

    sget-object v0, Log/i;->a:Log/h;

    iput-object v0, p0, Lmg/a;->d:Log/j;

    sget-object v0, Lng/c;->a:Lng/b;

    iput-object v0, p0, Lmg/a;->e:Lng/d;

    return-void
.end method


# virtual methods
.method public a()Lqg/g;
    .locals 1

    iget-object v0, p0, Lmg/a;->b:Lqg/g;

    return-object v0
.end method

.method public b()Lng/d;
    .locals 1

    iget-object v0, p0, Lmg/a;->e:Lng/d;

    return-object v0
.end method

.method public c()Log/j;
    .locals 1

    iget-object v0, p0, Lmg/a;->d:Log/j;

    return-object v0
.end method

.method public d()Lrg/n;
    .locals 1

    iget-object v0, p0, Lmg/a;->c:Lrg/n;

    return-object v0
.end method
