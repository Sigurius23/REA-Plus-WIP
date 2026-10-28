.class public abstract Lbi/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf93/a;

.field public static final b:Lf93/a;

.field public static final c:Lf93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf93/a;

    const-string v1, "GET"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lbi/h;->a:Lf93/a;

    new-instance v0, Lf93/a;

    sget-object v1, Lbi/q;->b:Lbi/q;

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lbi/h;->b:Lf93/a;

    new-instance v0, Lf93/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lbi/h;->c:Lf93/a;

    return-void
.end method
