.class public final Ln1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lp0/n0;


# instance fields
.field public final a:Ld0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lm22/b;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lm22/b;-><init>(I)V

    new-instance v1, Lmx1/o;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lmx1/o;-><init>(I)V

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v2, Ln1/o;->b:Lp0/n0;

    return-void
.end method

.method public constructor <init>(Ld0/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/o;->a:Ld0/e;

    return-void
.end method
