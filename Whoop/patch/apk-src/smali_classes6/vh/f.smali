.class public abstract Lvh/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf93/a;

.field public static final b:Lf93/a;

.field public static final c:Lf93/a;

.field public static final d:Lf93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf93/a;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lvh/f;->a:Lf93/a;

    new-instance v0, Lf93/a;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lvh/f;->b:Lf93/a;

    new-instance v0, Lf93/a;

    invoke-direct {v0, v2, v1}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lvh/f;->c:Lf93/a;

    new-instance v0, Lf93/a;

    invoke-direct {v0, v2, v1}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lvh/f;->d:Lf93/a;

    return-void
.end method
