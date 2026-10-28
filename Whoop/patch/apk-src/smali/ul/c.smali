.class public abstract Lul/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljc/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljc/b;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ljc/b;-><init>(I)V

    sput-object v0, Lul/c;->a:Ljc/b;

    return-void
.end method

.method public static a(ILul/a;)Ls/m2;
    .locals 2

    new-instance v0, Lg5/f;

    invoke-direct {v0, p0}, Lg5/f;-><init>(I)V

    new-instance p0, Ls/m2;

    sget-object v1, Lul/c;->a:Ljc/b;

    invoke-direct {p0, v0, p1, v1}, Ls/m2;-><init>(Lg5/f;Lul/a;Ljc/b;)V

    return-object p0
.end method
