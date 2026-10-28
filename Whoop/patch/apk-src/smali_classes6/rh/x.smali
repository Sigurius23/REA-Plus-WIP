.class public abstract Lrh/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lrh/w;

.field public static final b:Lf93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrh/w;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lrh/x;->a:Lrh/w;

    new-instance v0, Lf93/a;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lrh/x;->b:Lf93/a;

    return-void
.end method
