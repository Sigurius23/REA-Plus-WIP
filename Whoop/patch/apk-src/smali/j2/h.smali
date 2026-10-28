.class public abstract Lj2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La0/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    sget-object v0, Lj2/d;->e:Lj2/q;

    iget v1, v0, Lj2/c;->c:I

    shl-int/lit8 v2, v1, 0x6

    or-int/2addr v1, v2

    new-instance v2, Lj2/e;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v0, v3}, Lj2/g;-><init>(Lj2/c;Lj2/c;I)V

    iget v3, v0, Lj2/c;->c:I

    sget-object v4, Lj2/d;->x:Lj2/l;

    iget v5, v4, Lj2/c;->c:I

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr v5, v3

    new-instance v6, Lj2/g;

    const/4 v7, 0x0

    invoke-direct {v6, v0, v4, v7}, Lj2/g;-><init>(Lj2/c;Lj2/c;I)V

    iget v8, v4, Lj2/c;->c:I

    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v3, v8

    new-instance v8, Lj2/g;

    invoke-direct {v8, v4, v0, v7}, Lj2/g;-><init>(Lj2/c;Lj2/c;I)V

    sget-object v0, La0/t;->a:La0/g0;

    new-instance v0, La0/g0;

    invoke-direct {v0}, La0/g0;-><init>()V

    invoke-virtual {v0, v1, v2}, La0/g0;->h(ILjava/lang/Object;)V

    invoke-virtual {v0, v5, v6}, La0/g0;->h(ILjava/lang/Object;)V

    invoke-virtual {v0, v3, v8}, La0/g0;->h(ILjava/lang/Object;)V

    sput-object v0, Lj2/h;->a:La0/g0;

    return-void
.end method
