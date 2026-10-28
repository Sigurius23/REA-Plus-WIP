.class public final synthetic Lsh/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lsh/n;

.field public static final c:Lsh/n;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsh/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsh/n;-><init>(I)V

    sput-object v0, Lsh/n;->b:Lsh/n;

    new-instance v0, Lsh/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lsh/n;-><init>(I)V

    sput-object v0, Lsh/n;->c:Lsh/n;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lsh/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
